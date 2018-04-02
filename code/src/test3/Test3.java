package test3;
//方法调用时的别名机制
public class Test3 {
    static void change(Test t){
    	t.a = (float) 0.8;
    }
	public static void main(String[] args) {
		Test test = new Test();
		test.a = 2;
		System.out.println(test.a);
		change(test);
		System.out.println(test.a);

	}
}

class Test{
	
	float a;
}