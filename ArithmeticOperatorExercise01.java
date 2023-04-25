public class ArithmeticOperatorExercise01 {
	public static void main(String[] args) {
//		分析：i赋值给1；
		int i = 1;
/*		分析：规则使用临时变量；1、i赋给临时变量temp,i=temp=1;
 *          2、i=i+1,进行自增，i=2;
 *          3、i再返回赋给临时变量temp,i=1;
		*/
		i = i++;
		System.out.println(i);
	}
}