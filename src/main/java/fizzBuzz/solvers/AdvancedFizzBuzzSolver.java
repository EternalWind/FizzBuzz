package fizzBuzz.solvers;

import fizzBuzz.core.IFizzBuzzSolver;

// For Stage 2
public class AdvancedFizzBuzzSolver implements IFizzBuzzSolver {
	private boolean hasDigitIn(int wholeNumber, int digit) {
		while (wholeNumber > 0) {
			if (wholeNumber % 10 == digit) {
				return true;
			} else {
				wholeNumber /= 10;
			}
		}

		return false;
	}

	@Override
	public String solve(int number) {
		String output = "";

		boolean isDivisibleBy3 = number % 3 == 0;
		boolean isDivisibleBy5 = number % 5 == 0;
		boolean has3 = hasDigitIn(number, 3);
		boolean has5 = hasDigitIn(number, 5);

		boolean shouldOutputFizz = isDivisibleBy3 || has3;
		boolean shouldOutputBuzz = isDivisibleBy5 || has5;
		
		if (shouldOutputFizz && shouldOutputBuzz) {
			output = "FizzBuzz";
		} else if (shouldOutputFizz) {
			output = "Fizz";
		} else if (shouldOutputBuzz) {
			output = "Buzz";
		} else {
			output = Integer.toString(number);
		}

		return output;
	}

}
