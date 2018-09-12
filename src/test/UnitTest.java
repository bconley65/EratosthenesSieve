package test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.CalculatePrimeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UnitTest {
	@Test
	public void validTest() {
		
		int n = 20;
		
		List<Integer> testResults = new ArrayList<>(Arrays.asList(2,3,5,7));
		List<Integer> results = CalculatePrimeNumbers.calculatePrimes(n);
		Assert.assertEquals(testResults.size(),results.size());
	}

}
