public class OverLoadExercise01{
	public static void main(String[] args) {
		Methods m1 = new Methods();
		System.out.println(m1.Monkey(3));
		System.out.println(m1.Monkey(3,5));
		System.out.println("天上天下，唯我独尊--五条悟");
	}
}
class Methods {
	public int Monkey(int a) {
		return a*a;
	}
	public int Monkey(int a,int b) {
		return a*b;
	}
	public double Monkey(double a) {
		return a;
	}
}