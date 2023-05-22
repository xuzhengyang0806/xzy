import java.util.Scanner;
public class MulForExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double total = 0;
		int passNum = 0;
		for(int i = 1;i <= 3;i++) {
		double sum = 0;
		for(int j = 1;j <= 5;j++) {
			System.out.println("请输入第"+i+"班的第" + j + "个同学的成绩");
			double score = myScanner.nextDouble();
			if(score >= 60) {
				passNum++;
			}
			sum += score;
			System.out.println("成绩为" + score);
		}	
	     System.out.println("sum =" + sum + "平均分" + (sum/5));
	     total += sum;
	    }
		System.out.println("三个班的总成绩"+total+"平均分=" +total/(3*5));
		System.out.println("三个班及格的人数="+passNum);
	}
}