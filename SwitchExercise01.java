import java.util.Scanner;
public class SwitchExercise01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <=100) {
		switch((int)(score/60)) {
		case 0:
			System.out.println("成绩不合格");
			break;
		case 1:
			System.out.println("成绩合格");
			break;
		}
	}else {
		System.out.println("成绩输入有误");
	}
   }
}
