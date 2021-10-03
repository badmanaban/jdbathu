package testpackage;

public class PrimeNumber {

	public static void main(String[] args) {
				int x = 13;
				boolean flag = false;
				for (int i = 2; i <= x / 2; i++) {
					if (x % i == 0)
					{
						flag = true;
						break;
					}
				}
				if (!flag)
					System.out.println("Given number is a prime number.");
				else
					System.out.println("Given number is not a prime number.");
	}
		}