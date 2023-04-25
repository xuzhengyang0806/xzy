public class ArithmeticOperatorExercise02 {
	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
//		表达式时，先赋值，i = i1 = 10;再自增，i1 = i1 + 1=11;
		System.out.println("i =" + i);
		System.out.println("i2 =" + i2);
		i = --i2;
//		先自减，i2 = i2-1=19,再赋值给i,i = 19
		System.out.println("i =" + i);
		System.out.println("i2 =" + i2);
				
	}
}