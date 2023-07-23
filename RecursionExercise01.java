public class RecursionExercise01{
	public static void main(String[] args) {
		QQ q = new QQ();
		int n=9;
		int res= q.fibonacci(n);
		if(res !=-1) {
		System.out.println("当n="+n+"时，斐波那契数是"+res);
		}
	}
}
class QQ  {
	public int fibonacci(int n) {
	  if(n>=1) {
		if(n ==1 || n==2) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	   }else {
		   System.out.println("要求输入n>=1的整数");
		   return -1;
	   }
	}
}