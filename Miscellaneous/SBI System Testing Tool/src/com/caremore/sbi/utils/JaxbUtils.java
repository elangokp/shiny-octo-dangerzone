package com.caremore.sbi.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbUtils {

	@SuppressWarnings("unchecked")
	public static <T> T unmarshal(Class<T> docClass, File xmlFile) {
		T schemaObject = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(docClass);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			schemaObject = (T) JAXBIntrospector.getValue(unmarshaller
					.unmarshal(xmlFile));
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return schemaObject;
	}

	public static void marshall(Object xmlObject, File xmlFile) {
		try {
			JAXBContext jc = JAXBContext.newInstance(xmlObject.getClass());
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(xmlObject, System.out);
			marshaller.marshal(xmlObject, new FileOutputStream(xmlFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
