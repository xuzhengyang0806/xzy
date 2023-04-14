public class HanLianXiFloatDetail {
	public static void main(String[] args) {
//		默认为double型
		double num1 = 1.1;
//		测试double型后面加 “F”是否可运行，
		double num2 = 1.1F;
//		float型后需加上 “F”才不报错
		float num3 = 1.2F;
//		等价于0.123
		double num4 = .123;
//		5.12*10的2次方；
		double num5 = 5.12e2;
//		5.12/10的2次方；
		double num6 = 5.12E-2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
	}
}