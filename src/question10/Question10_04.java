package question10;

public class Question10_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i,j;


		for(i=1;i<=9;i++) { //縦軸設定

			for(j=1;j<=9;j++) { //横軸設定

				//9列目は改行させる
				if(j == 9) {
					System.out.println(i*j);
				}else {
					System.out.print(i*j+" ");
				}

			}

		}



	}

}
