package se01_selelctcontrolstatement.EX02_SwitchControlStatement;
//p.123 switch문 (break 미포함 , break 포함 , if문 변환)

public class SwitchControlStatement {

	public static void main(String[] args) {
		// break가 포함되지 않았을때
		int v1 = 2;
		switch (v1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B"); // 점프한 후 계속 실행
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();

		// break 포함
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

		// if - else if - else 구문으로 변환
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
