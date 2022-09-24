package com.eclipse.ec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.eclipse.ec.fizzbuzz.FizzBuzzService;

public class FizzBuzzServiceTest {
	
	private FizzBuzzService fb = new FizzBuzzService();
	
	@Test
	public void shouldReturn1For1() {
		//given - dane inicjalizaycjne
		int one = 1;
				
		//when
		List<String> result = fb.map(Arrays.asList(one));
		
		//then
		assertEquals("1", result.get(0));
	}
	
	@Test
	public void shouldReturnFizzFor3() {
		//given - dane inicjalizaycjne
		int three = 3;
				
		//when
		List<String> result = fb.map(Arrays.asList(three));
		
		//then
		assertEquals("Fizz", result.get(0));
	}
	
	@Test
	public void shouldReturnBuzzFor5() {
		//given - dane inicjalizaycjne
		int five = 5;
				
		//when
		List<String> result = fb.map(Arrays.asList(five));
		
		//then
		assertEquals("Buzz", result.get(0));
	}
	
	@Test
	public void shouldReturnFizzBuzz() {
		//given - dane inicjalizaycjne
		int fifteen = 15;
				
		//when
		List<String> result = fb.map(Arrays.asList(fifteen));
		
		//then
		assertEquals("FizzBuzz", result.get(0));
	}
	
	
	
}
