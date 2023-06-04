import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
//		创建一个数组double,长度为5
//		double score[] = new double[5];
		double score[];
		score = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i<score.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素的值：");
			score[i]=myScanner.nextDouble();
		}
		System.out.println("数组的元素值的情况如下：");
		for(int i = 0;i<score.length;i++) {
			System.out.println("第"+(i+1)+"个值是:"+score[i]);
		}
	}
}