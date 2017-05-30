package Data;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import Exceptions.UnknownOperatorException;
import Exceptions.ArithmeticException;
import App.Calculator;

public class Calculate {
	public static void main(String[] args) throws UnknownOperatorException, ArithmeticException {

		 double num1 = 0;
		 double num2 = 0;
		String operator;
		 boolean err = true;
		 boolean err1 = true;
		 final String ERRMSG = "Wrong value!";

		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		
		
		while (err) {
			System.out.println("Type first value: ");
			try {
				num1 = input.nextInt();
				err = false;
			} catch (InputMismatchException e) {
				System.err.println(ERRMSG);
				input.nextLine();
			}
		}
		input.nextLine();

		
		while (err1) {
			System.out.println("Type second value: ");
			try {
				num2 = input.nextDouble();
				err1 = false;
			} catch (InputMismatchException ex) {
				System.err.println(ERRMSG);
				input.nextLine();
			}

		}

		input.nextLine();
		do {
			System.out.println("What operation you want to perform? \n >For add, type + \n >For substract, type - \n >For divide, type / \n >For multiply, type *");
			operator = input.nextLine();
			switch (operator) {

			case "+":
				calc.addAndPrint(num1, num2);
				err = false;
				break;
			case "-":
				calc.subAndPrint(num1, num2);
				err = false;
				break;
			case "/":
				if(num2 == 0){
					throw new ArithmeticException("Are you crazy? Dont divide by 0 man!");
				}else{
				calc.divAndPrint(num1, num2);
				err = false;
				break;
				}
			case "*":
				calc.multAndPrint(num1, num2);
				err = false;
				break;
			default:
				err = true;
				throw new UnknownOperatorException(ERRMSG + "\n typed " + operator);	
			}
		} while (err);

		input.close();
	}

}