import java.util.Scanner;
public class ArrayExercise03 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int arr[] =new int[10];
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个元素值为:");
			arr[i]=myScanner.nextInt();
		}
		System.out.println("元素值情况如下：");
		for(int i =0;i<arr.length;i++) {
			System.out.println("第"+(i+1)+"个元素值是:"+arr[i]);
			sum+=arr[i];
		}
		System.out.println("和为:"+sum+"平均数:"+(sum/10));
	}
}