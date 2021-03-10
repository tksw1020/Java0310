package Javaworks0307;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		// TODO じゃんけんゲーム出来た どちらかが3回勝つまで続き勝った側がくじを引ける
		int count=0;
		int lose=0;
		Scanner s = new Scanner(System.in);
        String name[] = {"グー","チョキ","パー"};
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "回目");
            int y = (int)(Math.random() * 3);
            // 人間の手を選択
            System.out.print("何を出しますか？（0:グー，1:チョキ，2:パー）: ");
            int x  = s.nextInt();
            // 表示
            System.out.print("あなた：" + name[x] + "\n");
            System.out.print("CPU：" + name[y] + "\n");
            if (x==y) {
            	System.out.println("あいこ");
            }else if (x==1 && y==2){
            	count++;
            	System.out.println("Win"+count);	
            }else if (x==0 && y==1) {
            	count++;
            	System.out.println("Win"+count);
            }else if(x==2 && y==0) {
            	count++;
            	System.out.println("Win"+count);
            }else {
            	lose++;
            	System.out.println("Lose"+lose);
            }
            if (count==3 || lose==3) {
            	System.out.println("どちらかが勝ったのでおみくじを引けます");
            	int kuzi=0;
                kuzi = 1 + (int)(Math.random() * 3.0);
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
            	break;
            }
    }
  }
}