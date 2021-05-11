package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_04 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		String[] res = new String[3];
		int i = 0;

		for(i=0;i<3;i++) {
			res[i] = r.readLine();
		}

		System.out.println(res[0]+res[1]+res[2]);
	}

}
