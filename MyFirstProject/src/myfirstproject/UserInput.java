package myfirstproject;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = sc.nextLine();
       System.out.println("Enter your age");
       int age = sc.nextInt();
       System.out.println("Enter your gender");
       char gender = sc.next().charAt(0);
       System.out.println("Enter your mobile no");
       long no = sc.nextLong();
       System.out.println("...................");
       System.out.println("Name:"+ name);
       System.out.println("Age:"+ age);
       System.out.println("Gender:"+ gender);
       System.out.println("No:"+ no);
     sc.close();  
	}

}
