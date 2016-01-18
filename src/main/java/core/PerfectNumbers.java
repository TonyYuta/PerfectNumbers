package core;

public class PerfectNumbers {
	public static void main(String args[]) {
		int max = 10_000;
		for (int i = 1; i <= max; i++) {
			// Pass the number to our function for testing.
			test1(i);
		}
	}

	// Notice how we pass the number to the function for then testing
	// in the for statement. 

	public static void test1(int number) {
		int sum = 0;

		for(int divisor=1; divisor < number; divisor++) {
			if ((number % divisor) ==0) {
				sum = sum + divisor;
			}
		}

		if(sum==number) {
			System.out.print(number + ", ");
		}
	}
}

	

