package fizzBuzz.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.reset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fizzBuzz.core.FizzBuzzPlatform;
import fizzBuzz.core.IFizzBuzzSolver;

@ExtendWith(MockitoExtension.class)
class PlatformTests {
	@Mock
	private IFizzBuzzSolver mockSolver;

	@Test
	void test() {
		
	}

	@BeforeEach
	void resetMockSolver() {
		when(mockSolver.solve(anyInt())).thenReturn("MockOutput");
		reset(mockSolver);
	}
	
	@Test
	void testPlayFizzBuzzWithMinusNumbers() {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();

		assertThrows(IllegalArgumentException.class, () -> {
			platform.playFizzBuzz(-1, -10, mockSolver);
		});
	}

	@Test
	void testPlayFizzBuzzWithZero() {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();

		assertThrows(IllegalArgumentException.class, () -> {
			platform.playFizzBuzz(0, 10, mockSolver);
		});
	}
	
	@Test
	void testPlayFizzBuzzWithSmallerTo() {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();

		assertThrows(IllegalArgumentException.class, () -> {
			platform.playFizzBuzz(10, 1, mockSolver);
		});
	}
	
	@Test
	void testPlayFizzBuzzWithoutSolver() {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();

		assertThrows(NullPointerException.class, () -> {
			platform.playFizzBuzz(1, 10, null);
		});
	}
	
	@Test
	void testPlayFizzBuzzNormalCase() throws Exception {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();
		platform.playFizzBuzz(1, 10, mockSolver);
		
		verify(mockSolver, times(10)).solve(anyInt());
	}
	
	@Test
	void testPlayFizzBuzzExactlyOnce() throws Exception {
		FizzBuzzPlatform platform = new FizzBuzzPlatform();
		platform.playFizzBuzz(1, 1, mockSolver);
		
		verify(mockSolver).solve(anyInt());
	}
}
