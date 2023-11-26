package basics;

public class NumberOfDigits {
	
	public static void main(String[] args) {
		
		int n = 845275;
		
		// Solution 1
		{
			int digits = 1;
			for(int number = n/10; number != 0; number /= 10) {
				digits++;
			}
			System.out.println(digits);
		}
		
		// Solution 2
		{
			int digits = 1;
			for(long powersOfTen = 10; powersOfTen <= n; powersOfTen *= 10) {
				digits++;
			}
			System.out.println(digits);
		}
		
		// Solution 3
		{
			int digits = 1;
			if(n != 0) {
				digits = (int) Math.log10(n) + 1;
			}
			System.out.println(digits);
		}
		
		// Solution 4
		{
			if(n >= 10_000) {
				if(n >= 10_000_000) {
					if(n >= 100_000_000) {
						if(n >= 1_000_000_000) {
							System.out.println(10);
						} else {
							System.out.println(9);
						}
					} else {
						System.out.println(8);
					}
				} else if(n >= 10_000) {
					if(n >= 1_000_000) {
						System.out.println(7);
					} else {
						System.out.println(6);
					}
				} else {
					System.out.println(5);
				}
			} else if(n >= 100) {
				if(n >= 1000) {
					System.out.println(4);
				} else {
					System.out.println(3);
				}
			} else if(n >= 10) {
				System.out.println(2);
			} else {
				System.out.println(1);
			}
		}
		
	}

}
