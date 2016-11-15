/*
 * Kimberly M. Praxel
 * 11/06/16
 * USSalesTax.java
 */

package edu.greenriver.it.taxcalculators;


import java.util.ArrayList;

/**
 * Creates sales tax for US Customers
 * 
 * @author kimberlypraxel
 * @version 1.0
 */
public class USSalesTax implements ISalesTax{

	private int zipcode;
	private double zipcodeTaxRate;

	/**
	 * creates a new USSalesTax
	 * 
	 * @param zipcode - by state zipcode
	 */
	public USSalesTax(int zipcode){
		this.zipcode = zipcode;
	}

	/**
	 * tax calculations based on zipcode
	 * 
	 * @param salesSubTotal
	 * @return calculated tax
	 */
	@Override
	public double calculateTax(double salesSubTotal){

		ZipRange alaska = new ZipRange(99950, 99501, .00);
		ZipRange alabama = new ZipRange(36925, 35004, .04);
		ZipRange arkansas = new ZipRange(72959, 71601, .065);
		ZipRange texarkana = new ZipRange(75502, 75502, .065);
		ZipRange arizona = new ZipRange(86556, 85001, .056);
		ZipRange california = new ZipRange(96162, 90001, .075);
		ZipRange colorado = new ZipRange(81658, 80001, .029);
		ZipRange connecticut = new ZipRange(6389, 6001, .0635);
		ZipRange connecticut2 = new ZipRange(6928, 6401, .0635);
		ZipRange dc = new ZipRange(20039, 20001, .0575);
		ZipRange dc2 = new ZipRange(20599, 20042, .0575);
		ZipRange dc3 = new ZipRange(20799, 20799, .0575);
		ZipRange delware = new ZipRange(19980, 19701, .00);
		ZipRange flordia = new ZipRange(34997, 32004, .06);
		ZipRange georgia = new ZipRange(31999, 30001, .04);
		ZipRange georgia2 = new ZipRange(39901, 39901, .04);
		ZipRange hawaii = new ZipRange(96898, 96701, .04);
		ZipRange iowa = new ZipRange(52809, 50001, .06);
		ZipRange iowa2 = new ZipRange(68120, 68119, .06);
		ZipRange idaho = new ZipRange(83876, 83201, .06);
		ZipRange illinois = new ZipRange(62999, 60001, .0625);
		ZipRange indiana = new ZipRange(47997, 46001, .07);
		ZipRange kansas = new ZipRange(67954, 66002, .065);
		ZipRange kentucky = new ZipRange(42788, 40003, .06);
		ZipRange louisiana = new ZipRange(71232, 70001, .04);
		ZipRange louisiana2 = new ZipRange(71497, 71234, .04);
		ZipRange massachusetts = new ZipRange(2791, 1001, .0625);
		ZipRange massachusetts2 = new ZipRange(5544, 5501, .0625);
		ZipRange maryland = new ZipRange(20331, 20331, .06);
		ZipRange maryland2 = new ZipRange(20797, 20335, .06);
		ZipRange maryland3 = new ZipRange(21930, 20812, .06);
		ZipRange maine = new ZipRange(4992, 3901, .055);
		ZipRange michigan = new ZipRange(49971, 48001, .06);
		ZipRange minnesota = new ZipRange(56763, 55001, .0688);
		ZipRange missouri = new ZipRange(65899, 63001, .0423);
		ZipRange mississippi = new ZipRange(39776, 38601, .07);
		ZipRange mississippi2 = new ZipRange(71233, 71233, .07);
		ZipRange montana = new ZipRange(59937, 59001, .00);
		ZipRange northCarolina = new ZipRange(28909, 27006, .0475);
		ZipRange northDakota = new ZipRange(58856, 58001, .05);
		ZipRange nebraska = new ZipRange(68118, 68001, .055);
		ZipRange nebraska2 = new ZipRange(69367, 68122, .055);
		ZipRange newHampshire = new ZipRange(3897, 3031, .00);
		ZipRange newJersey = new ZipRange(8989, 7001, .07);
		ZipRange newMexico = new ZipRange(88441, 87001, .0513);
		ZipRange nevada = new ZipRange(89883, 88901, .0685);
		ZipRange newYork = new ZipRange(6390, 6390, .04);
		ZipRange newYork2 = new ZipRange(14975, 10001, .04);
		ZipRange ohio = new ZipRange(45999, 43001, .0575);
		ZipRange oklahoma = new ZipRange(73199, 73001, .045);
		ZipRange oklahoma2 = new ZipRange(74966, 73401, .045);
		ZipRange oregon = new ZipRange(97920, 97001, .00);
		ZipRange pennsylvania = new ZipRange(19640, 15001, .06);
		ZipRange rhodeIsland = new ZipRange(2940, 2801, .07);
		ZipRange southCarolina = new ZipRange(29948, 29001, .06);
		ZipRange southDakota = new ZipRange(57799, 57001, .04);
		ZipRange tennessee = new ZipRange(38589, 37010, .07);
		ZipRange texas = new ZipRange(73301, 73301, .0625);
		ZipRange texas2 = new ZipRange(75501, 75001, .0625);
		ZipRange texas3 = new ZipRange(79999, 75503, .0625);
		ZipRange texas4 = new ZipRange(88589, 88510, .0625);
		ZipRange utah = new ZipRange(84784, 84001, .0595);
		ZipRange virginia = new ZipRange(20041, 20040, .053);
		ZipRange virginia2 = new ZipRange(20167, 20040, .053);
		ZipRange virginia3 = new ZipRange(20042, 20042, .053);
		ZipRange virginia4 = new ZipRange(24658, 22001, .053);
		ZipRange vermont = new ZipRange(5495, 5001, .06);
		ZipRange vermont2 = new ZipRange(5907, 5601, .06);
		ZipRange washington = new ZipRange(99403, 98001, .065);
		ZipRange wisconsin = new ZipRange(54990, 53001, .05);
		ZipRange westVirginia = new ZipRange(26886, 24701, .06);
		ZipRange wyoming = new ZipRange(83128, 82001, .04);

		ArrayList<ZipRange> zipRangeList = new ArrayList<>();
				
		zipRangeList.add(alaska);
		zipRangeList.add(alabama);
		zipRangeList.add(arkansas);
		zipRangeList.add(texarkana);
		zipRangeList.add(arizona);
		zipRangeList.add(california);
		zipRangeList.add(colorado);
		zipRangeList.add(connecticut);
		zipRangeList.add(connecticut2);
		zipRangeList.add(dc);
		zipRangeList.add(dc2);
		zipRangeList.add(dc3);
		zipRangeList.add(delware);
		zipRangeList.add(flordia);
		zipRangeList.add(georgia);
		zipRangeList.add(georgia2);
		zipRangeList.add(hawaii);
		zipRangeList.add(iowa);
		zipRangeList.add(iowa2);
		zipRangeList.add(idaho);
		zipRangeList.add(illinois);
		zipRangeList.add(indiana);
		zipRangeList.add(kansas);
		zipRangeList.add(kentucky);
		zipRangeList.add(louisiana);
		zipRangeList.add(louisiana2);
		zipRangeList.add(massachusetts);
		zipRangeList.add(massachusetts2);
		zipRangeList.add(maryland);
		zipRangeList.add(maryland2);
		zipRangeList.add(maryland3);
		zipRangeList.add(maine);
		zipRangeList.add(michigan);
		zipRangeList.add(minnesota);
		zipRangeList.add(missouri);
		zipRangeList.add(mississippi);
		zipRangeList.add(mississippi2);
		zipRangeList.add(montana);
		zipRangeList.add(northCarolina);
		zipRangeList.add(northDakota);
		zipRangeList.add(nebraska);
		zipRangeList.add(nebraska2);
		zipRangeList.add(newHampshire);
		zipRangeList.add(newJersey);
		zipRangeList.add(newMexico);
		zipRangeList.add(nevada);
		zipRangeList.add(newYork);
		zipRangeList.add(newYork2);
		zipRangeList.add(ohio);
		zipRangeList.add(oklahoma);
		zipRangeList.add(oklahoma2);
		zipRangeList.add(oregon);
		zipRangeList.add(pennsylvania);
		zipRangeList.add(rhodeIsland);
		zipRangeList.add(southCarolina);
		zipRangeList.add(southDakota);
		zipRangeList.add(tennessee);
		zipRangeList.add(texas);
		zipRangeList.add(texas2);
		zipRangeList.add(texas3);
		zipRangeList.add(texas4);
		zipRangeList.add(utah);
		zipRangeList.add(virginia);
		zipRangeList.add(virginia2);
		zipRangeList.add(virginia3);
		zipRangeList.add(virginia4);
		zipRangeList.add(vermont);
		zipRangeList.add(vermont2);
		zipRangeList.add(washington);
		zipRangeList.add(wisconsin);
		zipRangeList.add(westVirginia);
		zipRangeList.add(wyoming);
		
		for(int i = 0; i < zipRangeList.size(); i++){

			if(zipcode < zipRangeList.get(i).getTop() && zipcode > zipRangeList.get(i).getBottom()){
				zipcodeTaxRate = zipRangeList.get(i).getTax();
			}
		}
		return salesSubTotal * zipcodeTaxRate;
	}
}
