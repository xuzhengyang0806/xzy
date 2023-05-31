import java.util.Scanner;
public class WhileBreak02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = myScanner.nextInt();
		while(true) {
			if(year % 4 ==0 && year % 100 == 1) {
				System.out.println("此年份为闰年");
				break;
			}else if(year % 400 ==0){
				System.out.println("此年份为闰年");
				break;
			}else {
				System.out.println("此年份不是闰年");
				break;
			}
		}
	}
}