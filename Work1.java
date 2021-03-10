package Javaworks0307;

import java.util.Random;

public class Work1 {

	public static void main(String[] args) {
		// TODO ‘å‹g‚ªo‚é‚Ü‚Åˆø‚«‘±‚¯‚ÄA‰½‰ñ–Ú‚Åˆø‚¯‚½‚©‚ğo—Í
		int kuzi;
		int count=0;
		while(true) {
			kuzi = 1 + (int)(Math.random() * 4.0);
			if(kuzi == 1) {
				count+=1;
				System.out.println("‹¥‚Å‚·");
			}
			if(kuzi == 2) {
				count+=1;
				System.out.println("¬‹g‚Å‚·");
			}
			if(kuzi == 3) {
				count+=1;
				System.out.println("’†‹g‚Å‚·");
			}
			if(kuzi == 4) {
				count+=1;
				System.out.println("‘å‹g‚Å‚·"+count+"‰ñ–Ú");
				break;
			}
		}
	}
}

