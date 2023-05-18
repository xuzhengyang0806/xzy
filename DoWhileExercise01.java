public class DoWhileExercise01 {
	public static void main(String[] args) {
     int i = 1;
     int sum =0;
     do {
    	 System.out.println("i = " + i);
    	 i++;
    	 sum += i;
     }while(i <= 100);
	System.out.println("退出do..while,程序继续运行");
	System.out.println("sum = " + sum);
	}
}