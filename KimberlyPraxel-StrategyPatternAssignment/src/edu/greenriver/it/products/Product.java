/*
 * Kimberly M. Praxel
 * 10/20/16
 * Product.java
 */


package edu.greenriver.it.products;


import java.io.*;
import java.util.*;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Product implements Serializable{

	private String name;
	private double price;
	private String [] keywords;

	/**
	 * constructor
	 * @param name - name of product
	 * @param price - price of product
	 * @param keywords - keywords of product
	 */
	public Product(String name, double price, String [] keywords){
		super();
		this.name = name;
		this.price = price;
		this.keywords = keywords;
	}

	/**
	 * empty contructor
	 */
	public Product(){

	}
	
	/**
	 * get name
	 * @return name
	 */
	@XmlElement
	public String getName(){
		return name;
	}

	/**
	 * sets name
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * get price
	 * @return price
	 */
	public double getPrice(){
		return price;
	}

	/**
	 * sets price
	 * @param price
	 */
	public void setPrice(double price){
		this.price = price;
	}

	/**
	 * get keywords
	 * @return keywords
	 */
	public String [] getKeywords(){
		return keywords;
	}

	/**
	 * sets keywords
	 * @param keywords
	 */
	public void setKeywords(String [] keywords){
		this.keywords = keywords;
	}


	@Override
	public String toString(){
		return "Product name: " + name + ", price: " + price + ", keywords: " + Arrays.toString(keywords);
	}


}
