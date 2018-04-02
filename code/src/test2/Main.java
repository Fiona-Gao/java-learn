package test2;

public class Main {
	static String string = "hello";
	
	public static void main(String[]  args) {
		Main main = new Main();
		main.string = "1";
		System.out.println(main.string);
		System.out.println(Main.string);
		Integer a=1000,b=1000;
		int c = 1000, d= 1000;
		System.out.println(a==b);
		System.out.println(c==d);
	}

}
