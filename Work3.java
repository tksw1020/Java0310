package Javaworks0307;

import java.util.Random;
import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// TODO �������o�͂��A���v��\��
		int x=0;
		for (int i = 1; i <= 5; i++) {
			Scanner s = new Scanner(System.in);
			int y= s.nextInt();
			x+=y;
            System.out.println("���v��"+x);
		}
	}
}
