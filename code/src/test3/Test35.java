/*
 * randomµÄÓ¦ÓÃ
 * */
package test3;

import java.util.Random;

public class Test35 {

	public static void main(String[] args) {
		Random rank = new Random(20);
		int s = rank.nextInt(1000) + 1;
		int t = rank.nextInt(100) + 1;
		double v = s/t;
		System.out.println(s);
		System.out.println(t);
		System.out.println(v);
	}

}
