package sec04_controlkeyword.EX01_BreakControlKeyword;

import java.util.Iterator;

public class BreakControlKeyword {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ���� �ݺ��� Ż��
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		//���� �ݸ� Ż��
		//01���� �ݺ����� Ż���� ��
		for (int i = 0; i < 5; i++) {
			for(int j = 0 ; j < 5 ; j++){
				if(j==2) {
					break;
				}
				System.out.println(i+", " + j);
			}
					   
		} 
		System.out.println();
		
		//@break + Lable ������ ���� �ݺ��� Ż�� 
		POS1: for(int i=0; i<5;i++) {
			for(int j = 0 ; j < 5; j++) {
				if(j==2) {
					break POS1;
				}
				System.out.println(i+", " + j);
			}
		}
		System.out.println();
		
		// @ �������� ������ ���� �ݺ��� Ż��
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<5; j++) {
				if(j==2) {
					i=100;
					break;
				}
				System.out.println(i+", " + j);
			}
		}
		System.out.println();
	}
}
