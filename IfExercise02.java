public class IfExercise02 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 17;
		int sum = n1 + n2;
		if(sum % 3 ==0 && sum % 5 ==0) {
			System.out.println("可以被整除");
		}else {
			System.out.println("不能被整除");
		}
	}
}