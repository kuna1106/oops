package oops.lab6.discount;

public class DiscountRate {
	static double serviceDiscountPremium;
	static double serviceDiscountGold;
	static double serviceDiscountSilver;
	static double productDiscountPremimum;
	static double productDiscountGold;
	static double productDiscountSilver;
	
	public static double getServiceDiscountRate(String type) throws IllegalAccessException {
		if (type.equals("premium")) {
			return serviceDiscountPremium;
		} else if (type.equals("gold")) {
			return serviceDiscountGold;
		} else if (type.equals("silver")) {
			return serviceDiscountSilver;
		} else {
			throw new IllegalAccessException("value is wrong");
		}
	}
	
	public static double getProductDiscountRate(String type) throws IllegalAccessException {
		if (type.equals("premium")) {
			return productDiscountPremimum;
		} else if (type.equals("gold")) {
			return productDiscountGold;
		} else if (type.equals("silver")) {
			return productDiscountSilver ;
		} else {
			throw new IllegalAccessException("value is wrong");
		}
	}
}
