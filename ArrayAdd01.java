import java.util.Scanner;
public class ArrayAdd01 {
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		Scanner myScanner = new Scanner(System.in);
		do {
		int arrNew[] = new int[arr.length+1];
		for(int i= 0;i<arr.length;i++) {
			arrNew[i]=arr[i];
		}
		System.out.println("请输入要添加的元素:");
		int numAdd =myScanner.nextInt();
		arrNew[arrNew.length-1]=numAdd;
		arr=arrNew;
		System.out.println("=======扩容后的arr元素情况=======");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("是否继续添加y/n");
		char key =myScanner.next().charAt(0);
		if(key=='n') {
			break;
		}
	   }while(true);
		System.out.println("以退出程序;");
	}
}