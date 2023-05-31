import java.util.Scanner;
public class WhileBreak03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个水仙花数（3位数）：");
		int number = myScanner.nextInt();
		int number1 = number/100;
		int number2 =number/10 % 10;
		int number3 =number % 10;
		if(number1*number1*number1+number2*number2*number2+number3*number3*number3==number) {
			System.out.println(number+"是水仙花数");
		}else {
			System.out.println(number+"不是水仙花数");
		}
	}
}