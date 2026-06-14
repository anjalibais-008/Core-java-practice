package myfirstproject;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner sc = new Scanner(System.in);
     String yn;
		do {
     System.out.println("Enter first no");
     int no1 = sc.nextInt();
     System.out.println("Enter second no");
     int no2 = sc.nextInt();
     System.out.println("Select Symbol(+,-,*,/)");
     String sym = sc.next();
     int res;
    switch(sym){
    case "+": res = no1+no2;
              System.out.println("Addition is" + res);
    case "-": res = no1-no2;
    System.out.println("Substraction is" + res);  
    case "*": res = no1+no2;
    System.out.println("Multiplication is" + res);
    case "/": res = no1/no2;
    System.out.println("Division is" + res);
    break;
    default : System.out.println("Invalid Symbol");
    break;
    }
    System.out.println("Do you want to continue (press y for yes and n for no) ");
    yn = sc.next();
		}
    while(yn.equals ("y")|| yn.equals ("Y"));
   
		
    sc.close();
    
	}

	}
