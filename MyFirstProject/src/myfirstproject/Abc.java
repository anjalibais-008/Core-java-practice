package myfirstproject;

public class Abc {
	
	 int a = 10;
	 static int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Abc ob1 = new Abc(); 
      System.out.println(ob1.a);//non static-access using object
      System.out.println(Abc.b);//static = access using class name
       ob1.a = 1000;
       Abc.b = 2000;
       System.out.println(ob1.a);
       System.out.println(Abc.b);
       
       Abc ob2 = new Abc();
       System.out.println(ob2.a);
       System.out.println(Abc.b);
       
	}

}
