package Javaworks0307;

import java.util.Random;

public class Work1 {

	public static void main(String[] args) {
		// TODO ��g���o��܂ň��������āA����ڂň����������o��
		int kuzi;
		int count=0;
		while(true) {
			kuzi = 1 + (int)(Math.random() * 4.0);
			if(kuzi == 1) {
				count+=1;
				System.out.println("���ł�");
			}
			if(kuzi == 2) {
				count+=1;
				System.out.println("���g�ł�");
			}
			if(kuzi == 3) {
				count+=1;
				System.out.println("���g�ł�");
			}
			if(kuzi == 4) {
				count+=1;
				System.out.println("��g�ł�"+count+"���");
				break;
			}
		}
	}
}

