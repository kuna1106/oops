import javabasics.lab1.CheckPassFail;
import oops.*;
import java.util.Scanner;

public class MenuSelect {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		printMenu();
		System.out.println("select options : ");
		int key = in.nextInt();
		switch (key) {
			case 1:
				System.out.println("selected javabasics");
				printMenuJavabasic();
				System.out.println("select option : ");
				int key2 = in.nextInt();
				switch (key2) {
					case 1:
						System.out.println("select option :");
						int key3 = in.nextInt();
						selectLab1(key3,args);
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					default:
						System.out.println("select options not valid");
						break;
				}
				break;
			case 2:
				System.out.println("select oops");
				printMenuOops();
				System.out.println("select option : ");
				int key3 = in.nextInt();
				switch (key3) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					default:
						System.out.println("select options not valid");
						break;
				}
				break;
			default:
				System.out.println("exit");
				break;
		}
	}
	
	public static void selectLab1(int key, String[] args) {
		switch (key) {
		case 1:
			System.out.println("1.1 CheckPassFail");
			CheckPassFail.main(args);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		default:
			System.out.println("select not valid");
			break;
		}
	}
	
	public static void printMenu() {
		System.out.println("===================");
		System.out.println("| menu selection  |");
		System.out.println("-------------------");
		System.out.println("| 1.javabasic     |");
		System.out.println("| 2.oops          |");
		System.out.println("===================");
	}
	
	public static void printMenuJavabasic() {
		System.out.println("=============================");
		System.out.println("| menu selection javabasic  |");
		System.out.println("|---------------------------|");
		System.out.println("| 1.lab1                    |");
		System.out.println("| 2.homework1               |");
		System.out.println("| 3.lab2                    |");
		System.out.println("| 4.homework2               |");
		System.out.println("=============================");
	}
	
	public static void printMenuOops() {
		System.out.println("========================");
		System.out.println("| menu selection oops  |");
		System.out.println("-----------------------");
		System.out.println("| 1.homework3          |");
		System.out.println("| 2.homework4          |");
		System.out.println("| 3.homework5          |");
		System.out.println("| 4.homework6          |");
		System.out.println("| 5.lab6               |");
		System.out.println("========================");
	}
}
