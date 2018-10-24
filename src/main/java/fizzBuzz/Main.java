package fizzBuzz;

import fizzBuzz.core.FizzBuzzPlatform;
import fizzBuzz.solvers.AdvancedFizzBuzzSolver;
import fizzBuzz.solvers.BasicFizzBuzzSolver;

public class Main {

	public static void main(String[] args) {
		BasicFizzBuzzSolver basicFizzBuzzSolver = new BasicFizzBuzzSolver();
		AdvancedFizzBuzzSolver advancedFizzBuzzSolver = new AdvancedFizzBuzzSolver();
		FizzBuzzPlatform platform = new FizzBuzzPlatform();
		
		System.out.println("=============== Stage 1 ================");
		
		platform.playFizzBuzz(1, 100, basicFizzBuzzSolver);
		
		System.out.println();
		System.out.println();
		
		System.out.println("=============== Stage 2 ================");
		platform.playFizzBuzz(1, 100, advancedFizzBuzzSolver);
	}

}
