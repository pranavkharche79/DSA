package fibonacci;
import java.util.Hashtable;
import java.util.Scanner;

public class FibooUsingHT {

	private static Hashtable<Integer, Long> ht=new Hashtable<>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
		long result=fibonacci(n);
		System.out.println("Fibonacci "+n+" = "+result);
	}

	private static long fibonacci(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Input number can not be negative");
		}			
		if(ht.containsKey(n)) {
			return ht.get(n);
		}
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		
		long result=fibonacci(n-1)+fibonacci(n-2);
		ht.put(n, result);
		return result;
	}

}
