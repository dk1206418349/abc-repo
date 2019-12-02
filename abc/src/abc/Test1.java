package abc;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("测试");
                int a=1;
		System.out.println(a);
		int b=2;
		for (int i = 0; i < 10; i++) {
			a=b+a;
			b=a+b;
		}
		
		System.out.println(b);
	}
}
