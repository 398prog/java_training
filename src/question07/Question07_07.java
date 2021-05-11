package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_07 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String str = r.readLine();
		int num = Integer.parseInt(str);
		double price = (double)num * 0.7;

		int res = (int)price;

		System.out.println("3割り引きで"+res+"円です。");


	}

}
