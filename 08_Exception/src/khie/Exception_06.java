package khie;

import java.util.Scanner;

//03
public class Exception_06 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Scanner sc = new Scanner(System.in);

		int su = 0;

		try {

			System.out.print("정수를 입력하세요. : ");
			su = sc.nextInt();
			System.out.println("입력 받은 수 >>> " + su);

		} catch (Exception e) {

			System.out.println("정수만 입력하세요.");
			System.out.println("예외정보 : " + e);

		} finally {
			// 입출력과 관련된 데이터를 처리하는 코드를 보통 이곳에다가 작성을 한다.
			sc.close();
		}

		System.out.println("프로그램 종료");

		sc.close();
	}

}
