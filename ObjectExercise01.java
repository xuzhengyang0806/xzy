public class ObjectExercise01 {
	public static void main(String[] args) {
		CC c = new CC();
		if(c.isOdd(2)) {
			System.out.println("是奇数");
		}else {
			System.out.println("是偶数");
		}
	}
}
class CC {
	public boolean isOdd(int num) {
		return num % 2 !=0?true:false;
	}
}