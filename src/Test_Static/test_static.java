package Test_Static;

public class test_static {
	private static int staticVar = 0;
	private int intanceVar = 0;
	
	public test_static() {
		staticVar ++;
		intanceVar ++;
		System.out.println("staticVar is: "+staticVar + " intanceVar is: " + intanceVar);
	}

	public static void main(String[] args) {
		test_static test1 = new test_static();
		test_static test2 = new test_static();
		test_static test3 = new test_static();
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "ab";
		String s4 = "ab";
		System.out.println(test1==test2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 == s4);

	}

}
