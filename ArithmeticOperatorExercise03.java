public class ArithmeticOperatorExercise03 {
	public static void main(String[] args) {
//		需求：假如还有59天放假，问：合XX个星期零XX天
/*      思路分析：
 *      1》使用int变量days保存天数；    
 * 	   	2》一个星期是7天，星期数weeks:days/7,零XX天leftdays:days % 7
 */
//      走代码
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天 合" + weeks + "星期零" + leftdays + "天");
	}
}