package Fadi;

public class Model {

	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public double subtract(double number1, double number2) {
		return number1 - number2;
	}

	public double multiply(double number1, double number2) {
		return number1 * number2;
	}
	public double divide(double number1,double number2) throws ArithmeticException
	{
		try
			{
		
		return number1/number2;
	}
		catch (ArithmeticException ex)
		{
			return -1;
		}
	}
	public int mod(int number1,int number2)
	{
		try
			{
				return number1%number2;
			}
			catch (ArithmeticException ex)
			{
				return -1;
			}
	}
	public double squareRoot(double number)
	{
	//	try
	//	{
		return Math.sqrt(number);
	//	}
	//	catch (ArithmeticException ex)
	//	{
	//		return -1;
	//	}
	}
}

