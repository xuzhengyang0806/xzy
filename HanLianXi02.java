public class HanLianXi02 {
	public static void main(String[] args) {
//		加号左右两边是数值型时，做加减运算
		System.out.println(100 + 98);
//		有一方为字符类型时，则做拼接运算
		System.out.println("100" + 98);
//		运算是从左到右的，先运算左边的加减，在拼接后面的字符
		System.out.println(100 + 3 +"hello");
//		左边开始是字符，所以接下来是拼接
		System.out.println("hello" + 100 + 3);
	}
}