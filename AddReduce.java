import java.util.Scanner;
public class AddReduce {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		do {
		int arrNew[] = new int[arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
			arrNew[i]=arr[i];
		}
		arr=arrNew;
		System.out.println("减少最后一个元素后的元素情况：");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		 }
		System.out.println("是否继续减小元素y/n");
		char key = myScanner.next().charAt(0);
		if(key=='n'||arr.length<2) {
			break;
		}
		}while(arr.length!=1);
		 System.out.print("不能再缩减了");

	}
}