package Javaworks0307;

import java.util.Random;
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// TODO 乱数を出力し、合計を表示
		int x=0;
		for (int i = 1; i <= 5; i++) {
			Scanner s = new Scanner(System.in);
			int y= s.nextInt();
			x+=y;
            System.out.println("合計は"+x);
		}
	}
}
