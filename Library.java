package L;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class main {
	public static void main(String args[]) {
		System.out.println("enter your ID");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		login(ID);
		 
	}
 static void login(int ID) {
	 List<Integer> userids = Arrays.asList(101, 102, 103, 104);
	 List<Integer> staffids = Arrays.asList(201, 202, 203, 204);

     if (userids.contains(ID)) {
         System.out.println("USER Page");
         user(ID);
     }
     else if(staffids.contains(ID)){
    	 System.out.println("staffID Page");
    	 staff(ID);
     }
     else {
         System.out.println("ID not found");
     }
 }
 static void user(int ID) {
	 System.out.println("User page");
 }
 static void staff(int ID) {
	 System.out.println("Staff page");
	 System.out.println("1.Available books");
	 System.out.println("2.Upload books");
	 
	 Scanner sc = new Scanner(System.in);
	 int choice = sc.nextInt();
	 switch (choice) {
	    case 1:
	        System.out.println("Available Books");
	        inventory();
	        break;
	    case 2:
	        System.out.println("Upload book:");
	        break;
	    default:
	        System.out.println("Invalid choice");
	}
	 
 }
 static void inventory() {
	 List<String> books = new ArrayList<>();

     books.add("Clean Code");
     books.add("Effective Java");
     books.add("The Complete Reference Java");
     books.add("Head First Java");
     books.add("Design Patterns");
     System.out.println(books);
 }
}
