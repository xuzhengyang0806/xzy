import java.util.Scanner;
//表示把java.util包下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
//创建Scanner对象，new创建一个对象，myScanner就是Scanner类的对象
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age =myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("名字 =" + name + "年龄 =" + age + "薪水 =" + sal);
	}
}