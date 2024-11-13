//Program to find sum of 1st n numbers (Parameterized)
import java.util.*;
public class Main
{
    public static void add(int i, int sum) {
        if(i < 1) {
            System.out.print(sum);
            return;
        }
        add(i - 1, sum + i);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		add(n, 0);
	}
}