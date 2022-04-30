import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
		int n, capacity, lit = 0, k;
		int[] l = new int[100], m = new int[100];
		n = sc.nextInt();
		capacity = sc.nextInt();
		for(int j = 0; j < n; j++) {
			l[j] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			lit += l[i];
			k = lit / capacity;
			lit -= k * capacity;
			k = k % 10;
			System.out.print(k);
		}
	}

}

