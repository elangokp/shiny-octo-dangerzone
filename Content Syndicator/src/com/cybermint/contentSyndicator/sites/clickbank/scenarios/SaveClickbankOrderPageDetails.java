package com.cybermint.contentSyndicator.sites.clickbank.scenarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.cybermint.contentSyndicator.sites.clickbank.objects.ClickbankOrderPageDetails;
import com.cybermint.utils.TextFileWriterUtils;

public class SaveClickbankOrderPageDetails implements Runnable{

	Future<ArrayList<ClickbankOrderPageDetails>> clickbankOrderPageDetailsList;
	String fileURL;
	String productImagesDirectoryPath;
	
	public SaveClickbankOrderPageDetails(Future<ArrayList<ClickbankOrderPageDetails>> clickbankOrderPageDetailsList, String fileURL, String productImagesDirectoryPath) {
		this.clickbankOrderPageDetailsList = clickbankOrderPageDetailsList;
		this.fileURL = fileURL;
		this.productImagesDirectoryPath = productImagesDirectoryPath;
	}
	
	private void saveImage(String imageUrl, String destinationFile) {
		try {
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);

			byte[] b = new byte[2048];
			int length;

			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
			}

			is.close();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			for(ClickbankOrderPageDetails aClickbankOrderPageDetails: clickbankOrderPageDetailsList.get()) {
				TextFileWriterUtils.writeString(aClickbankOrderPageDetails.toString(), this.fileURL, true, true);
				/*String imageDestinationFilePath = this.productImagesDirectoryPath
						+"/"+aClickbankOrderPageDetails.getVendorID()
						+"/"+aClickbankOrderPageDetails.getItemID()
						+"."+aClickbankOrderPageDetails.getProductImageExtension();
				this.saveImage(aClickbankOrderPageDetails.getProductImageURL(), imageDestinationFilePath);*/
				System.out.println(aClickbankOrderPageDetails.toString());
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
