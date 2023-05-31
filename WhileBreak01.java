import java.util.Scanner;
public class WhileBreak01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number = myScanner.nextInt();
		while(true) {
			if(number > 0) {
				System.out.println("大于0");
				break;
			}else if(number < 0) {
				System.out.println("小于0");
				break;
			}else {
				System.out.println("等于0");
				break;
			}
		}
		
	}
}