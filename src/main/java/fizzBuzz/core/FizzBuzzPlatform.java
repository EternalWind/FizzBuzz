package fizzBuzz.core;

public class FizzBuzzPlatform {
	public void playFizzBuzz(int from, int to, IFizzBuzzSolver solver) 
			throws IllegalArgumentException, NullPointerException {
		if (from <= 0 || from > to) {
			throw new IllegalArgumentException("Invalid input received");
		}
		
		if (solver == null) {
			throw new NullPointerException("A solver is needed");
		}
		
		for (int i = from; i <= to; ++ i) {
			System.out.print(solver.solve(i));
			System.out.println();
		}
	}
}
