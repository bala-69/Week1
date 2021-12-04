package week1.day1;

public class Calculator {
	public int add(int num1, int num2) {
		return num1+num2;
		
	}
	public double sub(double num1, double num2) {
		return num1-num2;
	}
	
	public double mul(double num1, double num2) {
		return  num1*num2;
	}
	public int div(int num1,int num2 ) {
		return num1/num2;
	}

	public static void main(String[] args) {
	Calculator calc= new Calculator();
	System.out.println(calc.add(20,30));
	System.out.println(calc.sub(50,30));
	System.out.println(calc.mul(40,30));
	System.out.println(calc.div(70,30));
	}

	}
