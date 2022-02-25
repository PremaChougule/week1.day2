package week1.day2;

public class Calculator {
	
	public void add()
	{
		int num1=1;
		int num2=2;
	    int num3=5;
	    System.out.println("Sum is : ");
	    System.out.println(num1+num2+num3);
	}
   public void sub()
   {
	   int num1=10;
	   int num2=5;
	   System.out.println(num1-num2);
   }
   public void mul()
   {
	   double num1=2;
	   double num2=3;
	   System.out.println(num1*num2);
   }
   public void divide()
   {
	   float num1 = 4;
	   float num2 = 2;
	   System.out.println(num2%num1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj=new Calculator();
		obj.add();
		obj.sub();
		obj.mul();
		obj.divide();
	}

}
