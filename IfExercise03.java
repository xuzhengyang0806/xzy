public class IfExercise03 {
	public static void main(String[] args) {
		int year = 2023;
		if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
	}
}