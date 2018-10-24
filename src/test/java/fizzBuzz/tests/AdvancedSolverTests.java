package fizzBuzz.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fizzBuzz.solvers.AdvancedFizzBuzzSolver;

class AdvancedSolverTests {

	@Test
	void testOutputFizzAdvanced() {
		AdvancedFizzBuzzSolver solver = new AdvancedFizzBuzzSolver();

		assertEquals("Fizz", solver.solve(3));
		assertEquals("Fizz", solver.solve(6));
		assertEquals("Fizz", solver.solve(9));
		assertEquals("Fizz", solver.solve(12));
		assertEquals("Fizz", solver.solve(33));
		assertEquals("Fizz", solver.solve(99));
		
		assertEquals("Fizz", solver.solve(43));
		assertEquals("Fizz", solver.solve(34));
		assertEquals("Fizz", solver.solve(133));
		assertEquals("Fizz", solver.solve(311));
		assertEquals("Fizz", solver.solve(331));
		assertEquals("Fizz", solver.solve(313));
		assertEquals("Fizz", solver.solve(103));
	}

	@Test
	void testOutputBuzzAdvanced() {
		AdvancedFizzBuzzSolver solver = new AdvancedFizzBuzzSolver();

		assertEquals("Buzz", solver.solve(5));
		assertEquals("Buzz", solver.solve(10));
		assertEquals("Buzz", solver.solve(55));
		assertEquals("Buzz", solver.solve(100));
		
		assertEquals("Buzz", solver.solve(52));
		assertEquals("Buzz", solver.solve(154));
		assertEquals("Buzz", solver.solve(511));
		assertEquals("Buzz", solver.solve(551));
	}
	
	@Test
	void testOutputFizzBuzzAdvanced() {
		AdvancedFizzBuzzSolver solver = new AdvancedFizzBuzzSolver();

		assertEquals("FizzBuzz", solver.solve(15));
		assertEquals("FizzBuzz", solver.solve(30));
		assertEquals("FizzBuzz", solver.solve(45));
		assertEquals("FizzBuzz", solver.solve(90));
		
		assertEquals("FizzBuzz", solver.solve(53));
		assertEquals("FizzBuzz", solver.solve(253));
		assertEquals("FizzBuzz", solver.solve(351));
		assertEquals("FizzBuzz", solver.solve(531));
		assertEquals("FizzBuzz", solver.solve(513));
	}
	
	@Test
	void testOutputNumberAdvanced() {
		AdvancedFizzBuzzSolver solver = new AdvancedFizzBuzzSolver();
		
		assertEquals("1", solver.solve(1));
		assertEquals("2", solver.solve(2));
		assertEquals("4", solver.solve(4));
		assertEquals("7", solver.solve(7));
		assertEquals("14", solver.solve(14));
		assertEquals("16", solver.solve(16));
		assertEquals("98", solver.solve(98));
		assertEquals("122", solver.solve(122));
		assertEquals("124", solver.solve(124));
		assertEquals("127", solver.solve(127));
	}

}
