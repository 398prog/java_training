package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String str = r.readLine();
		int age = Integer.parseInt(str);


		System.out.println("今年で"+age+"歳になります。");
	}

}
