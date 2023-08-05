public class OverLoadExercise02 {
	public static void main(String[] args) {
		R r = new R();
		System.out.println(r.max(12, 2));
		System.out.println(r.max(13.6, 163.2));
		System.out.println(r.max(123.3, 231.2,222));
	}
}
class R {
	public int max(int a,int b) {
		return a>b?a:b;
	}
	public double max(double a,double b) {
		return a>b?a:b;
	}
	public double max(double a,double b,double c) {
		double max1 =a>b?a:b;
		return max1>c?max1:c;
	}
}