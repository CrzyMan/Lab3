package primeFactors;

import static org.junit.Assert.*;
import static primeFactors.PrimeNumbers.generate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumbersTest {
	
	private Integer input;
	private List<Integer> expected;
	
	private static List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	public PrimeNumbersTest(Integer inputNumber, List<Integer> expectedValue){
		input = inputNumber;
		expected = expectedValue;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][]{
				{1, list()},
				{3, list(2)},
				{8, list(2,3,5,7)},
				{13, list(2,3,5,7,11)},
				{22, list(2,3,5,7,11,13,17,19)},
		});
	}
		
	@Test
	public void testPrimeNumbersChecker() {
		assertEquals(expected, generate(input));
	}
}
