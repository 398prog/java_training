package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_03 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String str = r.readLine();
		double size = Double.parseDouble(str);


		System.out.println("サイズが"+size+"cmの靴を購入します。");
	}

}
