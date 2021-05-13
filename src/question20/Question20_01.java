package question20;

public class Question20_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Test01 test1 = new Test01();
		Test01 test2 = new Test01();

		test1.setStr("test1");
		test2.setStr("test2");
		//test2 = test1;

		System.out.println("1つ目は"+test1.getStr()+"です。");
		System.out.println("2つ目は"+test2.getStr()+"です。");
	}

}
