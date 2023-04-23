public class StringToBasicDetail {
	public static void main(String[] args) {
		String str = "hello";
//		转换成int，看是否会报错
//		不能把“hello”转成整数
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
	}
}