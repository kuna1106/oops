package oops.lab6.discount;

import oops.homework3.Date;

public class TestMain {
	public static void main(String[] args) throws IllegalAccessException {
		Date date = new Date(26, 11, 2021);
		
		// test customer
		Customer customer1 = new Customer("andree");
		customer1.setMember(true);
		System.out.println(customer1.isMember());
		customer1.setMemberType("premium");
		System.out.println(customer1.getMemberType());
		System.out.println(customer1);
		
		// test visit
		Visit visit1 = new Visit(customer1.getName(), date);
		System.out.println("Date: " + date);
		System.out.println("name : " + visit1.getName());
		visit1.setProductExpense(46);
		visit1.setServiceExpense(99);
		System.out.println("sevice expense: " +visit1.getServiceExpense());
		System.out.println("product expense: " + visit1.getProductExpense());
		System.out.println("total expense: " + visit1.getTotalExpense());
		
		
		// discountRate
		double discount = visit1.getServiceExpense() * DiscountRate.getProductDiscountRate("premium")
                + visit1.getProductExpense() * DiscountRate.getProductDiscountRate("premium");
        double totalWithDiscount = visit1.getTotalExpense() - discount;
        System.out.printf("Discount is: %.1f", discount);
        System.out.println("\nTotal expenses after discount is: " + totalWithDiscount);
        System.out.println(visit1);
        System.out.println(customer1.getName());
	}
}
