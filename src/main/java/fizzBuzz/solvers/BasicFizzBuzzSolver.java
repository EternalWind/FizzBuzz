package fizzBuzz.solvers;

import fizzBuzz.core.IFizzBuzzSolver;

public class BasicFizzBuzzSolver implements IFizzBuzzSolver {

	public String solve(int number) {
		String output = "";
		
		boolean shouldOutputFizz = number % 3 == 0;
		boolean shouldOutputBuzz = number % 5 == 0;
		
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
