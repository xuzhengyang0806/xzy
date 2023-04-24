public class ArithmeticOperator {
	public static void main(String[] args) {
//		10是整数型，4是整数型，保留整数型结果，为2
		System.out.println(10/4);
//		10.0是double型，4是整数型，精度提升到double型，所以结果保留小数，为2.5；
		System.out.println(10.0/4);
//		10是整数型，4是整数型，保留整数型为2，赋值给double型，则保留小数点，则为2.0；
		double d = 10 / 4;
		System.out.println(d);
//		10-（10除以3）*3,结果为1；
		System.out.println(10 % 3);
//		-10-（-10除以3）*3，结果为-1；
		System.out.println(-10 % 3);
//		10-(10除以-3)*-3，结果为1；
		System.out.println(10 % -3);
//		-10-(-10除以-3)*-3，结果为-1；
		System.out.println(-10 % -3);
//		独立语句时吗,i++等价于i = i + 1,结果为11；
		int i = 10;
		i++;
		System.out.println(i);
//		独立语句时，++k等价于k = k + 1,结果为11;
		int k = 10 ;
		++k;
		System.out.println(k);
//		作为表达式时，++j先自增，后赋值，等价于j = j + 1,自增为9，后赋值给p,p = 9;
		int j = 8;
		int p = ++j;
		System.out.println("j=" + j + "p=" + p);
//		作为表达式时，c++先赋值，后自增，等价于c = 10,赋值给e,e = 10;后自增，c = c + 1,c = 11;
		int c = 10;
		int e = c++;
		System.out.println("c =" + c + "e =" + e);
	}
}