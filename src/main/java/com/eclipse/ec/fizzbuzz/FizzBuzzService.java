package com.eclipse.ec.fizzbuzz;

import java.util.List;

import interfaces.NumbersRepository;

public class FizzBuzzService {

	private NumbersRepository numbersRepository;
	
	public FizzBuzzService() {}
	
	public FizzBuzzService(NumbersRepository numbersRepository) {
		this.numbersRepository = numbersRepository;
	}
	
	public List<String> mapFromRepository() {
		List<Integer> numbers = numbersRepository.getNumbersToMap();
		return map(numbers);
	}
	
	//public String map(int number) {

	public List<String> map(List<Integer> numbers) {
		List<String> result = numbers.stream().map(number -> {

			StringBuilder sb = new StringBuilder();

			if (number % 3 == 0) {
				// return "Fizz";
				sb.append("Fizz");
			}

			if (number % 5 == 0) {
				// return "Buzz";
				sb.append("Buzz");
			}

			return sb.isEmpty() ? number + "" : sb.toString();
		}).toList();

		return result;

		// return (String.valueOf(number));
		// return number + ""; - sztuczka magiczka
	}

}
