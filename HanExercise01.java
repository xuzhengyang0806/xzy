public class HanExercise01 {
	public static void main(String[] args) {
		int count =0;
		for(int n = 1;n<=100;n++) {
			if(n % 5 != 0) {
			System.out.print(n+" ");
			count++;
			if(count % 5 ==0) {
				System.out.println();
			}
			}
		}
	}
}