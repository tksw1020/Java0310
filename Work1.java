package Javaworks0307;

import java.util.Random;

public class Work1 {

	public static void main(String[] args) {
		// TODO 大吉が出るまで引き続けて、何回目で引けたかを出力
		int kuzi;
		int count=0;
		while(true) {
			kuzi = 1 + (int)(Math.random() * 4.0);
			if(kuzi == 1) {
				count+=1;
				System.out.println("凶です");
			}
			if(kuzi == 2) {
				count+=1;
				System.out.println("小吉です");
			}
			if(kuzi == 3) {
				count+=1;
				System.out.println("中吉です");
			}
			if(kuzi == 4) {
				count+=1;
				System.out.println("大吉です"+count+"回目");
				break;
			}
		}
	}
}

