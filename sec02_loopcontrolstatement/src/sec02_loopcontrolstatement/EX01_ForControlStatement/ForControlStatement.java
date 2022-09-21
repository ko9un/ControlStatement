package sec02_loopcontrolstatement.EX01_ForControlStatement;

// p.128 for문 기본 문법 
public class ForControlStatement {

	public static void main(String[] args) {

		int a;
		for (a = 0; a < 3; a++) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 9; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.print(i + j + " ");
		}
		System.out.println();
		// for 문의 특수한 형태(무한 루프)
		/*
		 * for(int i = 0; 생략 ; i++){ System.out.print(i+""); } for(;;){ sysout("무한 루프");
		 * }
		 */

		System.out.println();
		// 무한 루프 탈출

		for (int i = 0;; i++) {
			if (i > 10) {
				break;

			}
			System.out.print(i + "");
		}
		System.out.print("무한루프탈출");
	}
}
