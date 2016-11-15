/*
 * Kimberly M. Praxel
 * 10/20/16
 * XmlWriter.java
 */

package edu.greenriver.it.fileio;


import java.io.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


import edu.greenriver.it.products.Product;


public class XmlWriter implements Writer{

	
	/**
	 * This saves an object to as xml object file into the data folder
	 * 
	 * @param object
	 *            - a product object
	 */
	public void saveObject(Product object){
		try{
			JAXBContext context = JAXBContext.newInstance(Product.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, new File(getFilename(object.getName())));
		}catch(JAXBException e){
			e.printStackTrace();
		}
	}

	/**
	 * This loads a xml object file from the data folder
	 * 
	 * @param name
	 *            - name of file
	 * @return product - from file
	 */
	public Product loadObject(String name){
		try{
			JAXBContext context = JAXBContext.newInstance(Product.class);
			Unmarshaller u = context.createUnmarshaller();
			Product dataObject = (Product)u.unmarshal(new File(getFilename(name)));
			return dataObject;
		}catch(JAXBException e){
			e.printStackTrace();
		}
		return null;
	}

	
	private String getFilename(String name){
		return "data/" + name + ".xml";
	}

}
