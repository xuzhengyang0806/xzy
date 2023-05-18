public class WhileExercise02 {
	public static void main(String[] args) {
		int start = 40;
		int end = 200;
		while(start <= end) {
			if(start % 2 == 0) {
			System.out.println("start = " + start);
			}
			start++;
		}
	}
}