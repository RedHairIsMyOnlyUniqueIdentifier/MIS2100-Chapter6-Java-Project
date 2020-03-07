package Smith.Connor.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		
		if (denominator == 0) {
			throw new ArithmeticException("Cannot Divide by Zero");
	}
		double result = numerator / denominator;
		System.out.println(result);
		return result;
}
	
	
}
