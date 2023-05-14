import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		if(month >= 4 && month <= 10) {
			System.out.println("请输入你的年龄");
			int age = myScanner.nextInt();
			if(age >= 18 && age <=60) {
				System.out.println("票价：60元");
			}else if(age < 18){
				System.out.println("票价：" + 60*1/2);
			}else {
				System.out.println("票价：" + 60*1/3);
			}
		}else {
			System.out.println("请输入你的年龄");
			int age = myScanner.nextInt();
			if(age >= 18 && age <=60) {
				System.out.println("票价：40元");
			}else {
				System.out.println("票价：20元");
			}
		}
	}
}