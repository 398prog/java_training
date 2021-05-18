package question10;

public class Question10_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("1 回目の繰り返し処理です");

//		for (int i = 0; i < 5; i++) {
//			System.out.println((i + 1) + "回目");
//		}

		int i = 0;

		while(i < 5) {
			System.out.println((i + 1) + "回目");
			i++;
		}

		System.out.println("2 回目の繰り返し処理です");

//		for (i = 5; i > 0; i--) {
//			System.out.println(i + "回目");
//		}

		i = 5;

		while(i > 0) {
			System.out.println(i + "回目");
			i--;
		}

		System.out.println("処理を終了します");

	}

}
