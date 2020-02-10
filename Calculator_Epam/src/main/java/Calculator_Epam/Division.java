package Calculator_Epam;

public class Division implements Arithmetic{
	public void calculate(double a,double b)
	{
		if(b!=0)
			System.out.println("The Division of two numbers is "+(a/b));
		else
			System.out.println("Cannot divide by zero");
	}
}
