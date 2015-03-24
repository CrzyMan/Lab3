package primeFactors;

import java.util.List;

public class PrimeNumberChecker {

	public boolean validate(Integer input) {
		
		for (int candidate = 2; candidate < input; candidate++) {
			if (input % candidate == 0) {
				return false;
			}
		}
		return true;
	}

	public List<Integer> generate(Integer input) {
		return null;
	}

}
