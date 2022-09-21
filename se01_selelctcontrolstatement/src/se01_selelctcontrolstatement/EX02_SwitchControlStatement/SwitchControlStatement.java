package se01_selelctcontrolstatement.EX02_SwitchControlStatement;
//p.123 switch�� (break ������ , break ���� , if�� ��ȯ)

public class SwitchControlStatement {

	public static void main(String[] args) {
		// break�� ���Ե��� �ʾ�����
		int v1 = 2;
		switch (v1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B"); // ������ �� ��� ����
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();

		// break ����
		int v2 = 2;
		switch (v2) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();

		// if - else if - else �������� ��ȯ
		if (v1 == 1) {
			System.out.println("A");
		} else if (v1 == 2) {
			System.out.println("B");
		} else if (v1 == 3) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
