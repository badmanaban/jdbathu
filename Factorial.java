package testpackage;

public class Factorial {

	public static void main(String[] args) {
int x =5;
int fact =1;

for (int i = 1; i <= x; i++) {
	fact= fact *i;
	
	
}
System.out.println("The Factorial of " + x + " is " +fact);
	}

}
