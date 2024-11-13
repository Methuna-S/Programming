//Basic backtracking code to print numbers n to 1
import java.util.Scanner;
public class Main
{
    private static void recursion(int i, int n) {
        if(i > n) {
            return;
        }
        recursion(i + 1, n); // backtracking
        System.out.println(i);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recursion(1, n);
	}
}