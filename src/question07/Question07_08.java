package question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_08 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int i=0;

		int res = 0;
		int[] num = new int[3];
		double[] price = new double[3];
		int mean = 0;

		for(i=0;i<3;i++) {
			String str = r.readLine();

			num[i] =Integer.parseInt(str);
			price[i] = (double)num[i] * 0.7;

			res += (int)price[i];
		}

		mean = res / 3;

		System.out.println("合計"+res+"円");
		System.out.println("平均"+mean+"円");


	}

}
