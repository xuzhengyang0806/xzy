public class LogicOperator02 {
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
//		对于逻辑与&而言，如果第一个条件位false,第二个条件仍会判断
		if(a < 1 & ++b < 50) {
//		第一个条件位false，第二个条件位为true,则结果为false,所以ok300不显示；	
			System.out.println("ok300");
		}
//		结果为a = 4,b = 10;
		System.out.println("a =" + a + "b=" + b);
	}
}