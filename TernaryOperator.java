public class TernaryOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
//		a > b为false，返回b--,先返回b值，再进行b-1
		int result = a > b ? a++ :b--;
		System.out.println("result =" + result);
	}
}