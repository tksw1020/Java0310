package Javaworks0307;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		// TODO ����񂯂�Q�[���o���� �ǂ��炩��3�񏟂܂ő�������������������������
		int count=0;
		int lose=0;
		Scanner s = new Scanner(System.in);
        String name[] = {"�O�[","�`���L","�p�["};
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "���");
            int y = (int)(Math.random() * 3);
            // �l�Ԃ̎��I��
            System.out.print("�����o���܂����H�i0:�O�[�C1:�`���L�C2:�p�[�j: ");
            int x  = s.nextInt();
            // �\��
            System.out.print("���Ȃ��F" + name[x] + "\n");
            System.out.print("CPU�F" + name[y] + "\n");
            if (x==y) {
            	System.out.println("������");
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
            	System.out.println("�ǂ��炩���������̂ł��݂����������܂�");
            	int kuzi=0;
                kuzi = 1 + (int)(Math.random() * 3.0);
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
            	break;
            }
    }
  }
}