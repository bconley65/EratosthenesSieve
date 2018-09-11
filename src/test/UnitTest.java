package test;
import org.junit.jupiter.api.Test;

import main.CalculatePrimeNumbers;



import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UnitTest {
	@Test
	public void validTest() {
		
		int n = 9;
		

		List<Integer> testResults = new ArrayList<>(Arrays.asList(2, 3, 5, 7));
		List<Integer> results = CalculatePrimeNumbers.calculatePrimes(n);
		assertEquals(testResults, results);
	}

}
