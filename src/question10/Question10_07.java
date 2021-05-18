package question10;

import java.util.Arrays;

public class Question10_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] num = {30, 53, 21, 70, 60};

//		for (int i = 0; i < num.length - 1; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//
//				if (num[i] > num[j]) {
//					int tmp = num[i];
//					num[i] = num[j];
//					num[j] = tmp;
//				}
//			}
//		}

		Arrays.sort(num);

		System.out.println("ソートが完了しました");

		for (int i:num) {
			System.out.print(i+ " ");
		}


	}

}
