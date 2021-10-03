package testpackage;

public class ConNegNumToPos {

	public static void main(String[] args) {
		int number = -50;
		int x = -1;
		int y = (number * x);
		if (number < 0) {
			System.out.println("The number " + number + " is converted to " + y);
		} else {
			System.out.println("The Given number is positive");
		}
	}

}
