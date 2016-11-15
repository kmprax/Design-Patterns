package edu.greenriver.it.producttest;




import edu.greenriver.it.fileio.*;
import edu.greenriver.it.products.Product;


public class ProductsDriver{

	public static void main(String [] args){

		Product macbookPro = new Product("MacBook Air", 1199.00,
				new String[]{ "Apple", "13inch", "Air", "Beautiful", "Powerful", "Amazing"});

		startProgram(macbookPro);
	}

	public static void startProgram(Product macbookPro){
		Console.print("Product Manager Application");
		Console.print("Write a product to a file:");
		Console.print(macbookPro.toString());
		System.out.println();
		int userChoice = 0;
		while(userChoice != 4){
			Console.print("1. Save as JSON");
			Console.print("2. Save as XML");
			Console.print("3. Save as Java Object");
			Console.print("4. Exit");
			userChoice = Console.getInt("Select a file format");
			Writer productWriter = null;
			while(productWriter == null){
				if(userChoice == 1){
					productWriter = new JsonWriter();
				}else if(userChoice == 2){
					productWriter = new XmlWriter();
				}else if(userChoice == 3){
					productWriter = new ObjectWriter();
				}else if(userChoice == 4){
					return;
				}else{
					userChoice = Console.getInt("Invalid Input. Select a file format");
				}
			}
			Console.print("Writing product to file");
			productWriter.saveObject(macbookPro);
			Console.print("Object saved to file.");
			System.out.println();
			Console.print("Reading product from file");
			System.out.println(productWriter.loadObject("MacBook Pro"));
			System.out.println();
		}
	}
}
