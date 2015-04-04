package com.cybermint.siteDetector.elgg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ElggRegisterFormElementsDetector implements Callable {

	String registerUrl;
	
	public ElggRegisterFormElementsDetector(String registerUrl) {
		this.registerUrl = registerUrl;
	}

	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		return getFormElements(registerUrl);
	}
	
	public List<String> getFormElements(String url) {
		Response response = null;
		Integer statusCode = 0;
		List<String> formElementsAsString = new ArrayList<String> ();
		try {
			//System.out.println("Checking for : " + registerUrl);
			response = Jsoup.connect(url)
					.timeout(20000).execute();
			statusCode = response.statusCode();
			//System.out.println("Status Code for : " + registerUrl + " is " + statusCode);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
		}
		if (statusCode.equals(200)) {
			//System.out.println("Added : " + registerUrl);
			try {
				Document registerDoc = response.parse();
				Elements registerFormElements = registerDoc.select("form[action*=register]");
				Elements formInputElements = new Elements ();
				for(Element registerFormElement : registerFormElements) {
					formInputElements.addAll(registerFormElement.select("input:not([type~=hidden|submit])"));
				}				
				for(Element formInputElement : formInputElements) {
					StringBuilder nameAndType = new StringBuilder();
					nameAndType.append("name=").append(formInputElement.attr("name"));
					nameAndType.append(" AND ");
					nameAndType.append("type=").append(formInputElement.attr("type"));
					formElementsAsString.add(nameAndType.toString());
				}
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
		return formElementsAsString;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
