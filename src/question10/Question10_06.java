package question10;

public class Question10_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 10; i++) {

			if(i == 5) { //5回目で飛ばす

				continue;
			}

			System.out.println(i + "回目の処理です");

		}

		System.out.println("処理を終了します");

	}

}
