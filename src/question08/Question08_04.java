package question08;

public class Question08_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[][] num = {{10,20,30},{40,50,60}};

		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println((i+1)+"段目の"+(j+1)+"つ目の値は"+num[i][j]);
			}
		}

	}

}
