package fizzBuzz.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fizzBuzz.solvers.BasicFizzBuzzSolver;

class BasicSolverTests {

	@Test
	void testOutputFizzBasic() {
		BasicFizzBuzzSolver solver = new BasicFizzBuzzSolver();

		assertEquals("Fizz", solver.solve(3));
		assertEquals("Fizz", solver.solve(6));
		assertEquals("Fizz", solver.solve(9));
		assertEquals("Fizz", solver.solve(12));
		assertEquals("Fizz", solver.solve(33));
		assertEquals("Fizz", solver.solve(99));
	}

	@Test
	void testOutputBuzzBasic() {
		BasicFizzBuzzSolver solver = new BasicFizzBuzzSolver();

		assertEquals("Buzz", solver.solve(5));
		assertEquals("Buzz", solver.solve(10));
		assertEquals("Buzz", solver.solve(55));
		assertEquals("Buzz", solver.solve(100));
	}
	
	@Test
	void testOutputFizzBuzzBasic() {
		BasicFizzBuzzSolver solver = new BasicFizzBuzzSolver();

		assertEquals("FizzBuzz", solver.solve(15));
		assertEquals("FizzBuzz", solver.solve(30));
		assertEquals("FizzBuzz", solver.solve(45));
		assertEquals("FizzBuzz", solver.solve(90));
	}
	
	@Test
	void testOutputNumberBasic() {
		BasicFizzBuzzSolver solver = new BasicFizzBuzzSolver();
		
		assertEquals("1", solver.solve(1));
		assertEquals("2", solver.solve(2));
		assertEquals("4", solver.solve(4));
		assertEquals("7", solver.solve(7));
		assertEquals("14", solver.solve(14));
		assertEquals("16", solver.solve(16));
		assertEquals("98", solver.solve(98));
	}
}
