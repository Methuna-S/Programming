//Program to find sum of 1st n numbers (functional)
import java.util.*;
public class Main
{
    public static int add(int n) {
        if(n == 0) {
            return 0;
        }
        return n + add(n - 1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(add(n));
	}
}