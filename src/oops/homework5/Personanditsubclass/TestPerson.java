package oops.homework5.Personanditsubclass;

public class TestPerson {
	public static void main(String[] args) {
		Student student1 = new Student("Mark Tim", "94 The Avenue, London", "Master", 2021, 500);
		System.out.println(student1);
		
		Staff staff1 = new Staff("John Smith", "3 Victoria Street, London", "University of London", 2000.00);
		System.out.println(staff1);
		
		System.out.println(staff1.getName());
		System.out.println(student1.getName());
		staff1.setPay(2100.00);
		System.out.println(staff1.getPay());
	}
}
