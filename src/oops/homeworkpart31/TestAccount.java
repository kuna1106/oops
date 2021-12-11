package oops.homeworkpart31;

public class TestAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(987, "Cal Dexter", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getID());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        // Test Account class
        Account a1 = new Account(987, c1, 1500);
        System.out.println(a1);

        System.out.println("id is: " + a1.getID());
        System.out.println("customer is: " + a1.getCustomer());
        System.out.println("balance is: " + a1.getBalance());
        System.out.println("customer's name is: " + a1.getCustomerName());

        a1.setBalance(2100);
        System.out.println(a1);
        System.out.println("customer's name is: " + a1.getCustomerName());

        Account a2 = new Account(987, c1, 100);
        System.out.println(a2);
        System.out.println(a2.deposit(1500));
        System.out.println(a2.withdraw(900));
    }
}
