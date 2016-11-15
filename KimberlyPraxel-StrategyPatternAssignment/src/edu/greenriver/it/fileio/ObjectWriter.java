/*
 * Kimberly M. Praxel
 * 10/20/16
 * ObjectWriter.java
 */


package edu.greenriver.it.fileio;


import java.io.*;


import edu.greenriver.it.products.Product;


/**
 * This saves and reads java object file
 * 
 * @author kimberlypraxel
 * @version 1.0
 */

public class ObjectWriter implements Writer{

	/**
	 * This saves an object to as java object file into the data folder
	 * 
	 * @param object
	 *            - a product object
	 */
	public void saveObject(Product object){
		FileOutputStream javaDataFile;
		try{
			javaDataFile = new FileOutputStream(getFilename(object.getName()));
			ObjectOutputStream productObject = new ObjectOutputStream(javaDataFile);
			productObject.writeObject(object);
			productObject.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * This loads a java object file from the data folder
	 * 
	 * @param name
	 *            - name of file
	 * @return product - from file
	 */
	public Product loadObject(String name){
		try{
			FileInputStream javaDataFile = new FileInputStream(getFilename(name));
			ObjectInputStream productObject = new ObjectInputStream(javaDataFile);
			Product fileProduct = (Product)productObject.readObject();
			productObject.close();
			return fileProduct;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	private String getFilename(String name){
		// TODO Auto-generated method stub
		return "data/" + name + ".dat";
	}
}
