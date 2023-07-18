package week1.day2;

public class PositiveToNegative {
	static int n=-40;
	public void check()
	{
		if(n<0)
		{
			System.out.println("Given number is Negative: "+n);
			int num= (-n);
			System.out.println("Coverted positive number is "+num);
		}
		else
		{
			System.out.println("the Number given is already positive: "+n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveToNegative n1=new PositiveToNegative();
		n1.check();
	}

}
