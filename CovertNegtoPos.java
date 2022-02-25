package week1.day2;

public class CovertNegtoPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40;
		
		if (number<0)
		{
          int PositiveNumber = number*(-1);
			System.out.println(PositiveNumber);
		}

		else 
		{
			System.out.println("Number is already Positive");
		}
	}

}
