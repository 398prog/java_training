package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_01 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("input number:");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String str = r.readLine();

		int num = Integer.parseInt(str);
		if(num >= 10) {
			System.out.println("numberの値は10以上です");
		}

		System.out.print("処理を終了します。");



	}

}
