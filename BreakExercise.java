public class BreakExercise {
	public static void main(String[] args) {
		int sum =0;
		int n = 0;
		for(int i = 1;i<=100;i++) {
			System.out.println("i=" +i);
			sum+=i;
		 if(sum>=20) {
			 n=i;
			 break;
		 }
		
		}
		System.out.println("sum="+sum);
		System.out.println("当和大于20时，当前数="+n);
	}
}