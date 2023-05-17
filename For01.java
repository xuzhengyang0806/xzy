//打印1--100之间所有是9的倍数的整数，统计个数及和；
public class For01 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int start = 100;
		int end = 10000;
		for(int i =start;i<=end;i++) {
		  if(i % 9 == 0) {	
			System.out.println("i=" + i);
			count++;
			sum += i;
		}
	  }
	  System.out.println("count =" + count);
	  System.out.println("sum =" + sum);
	}
}