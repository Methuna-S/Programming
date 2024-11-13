//Basic recursion code to print numbers 1 to n
import java.util.Scanner;
public class Main
{
    private static void recursion(int i, int n) {
        if(i > n) {
            return;
        }
        System.out.println(i);
        recursion(i + 1, n);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recursion(1, n);
	}
}