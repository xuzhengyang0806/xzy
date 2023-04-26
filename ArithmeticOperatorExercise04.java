public class ArithmeticOperatorExercise04 {
	public static void main(String[] args) {
//		需求：定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)，请求出华氏温度对应的摄氏温度。[234.5]
/*
 *      分析：
 *      1>华氏温度234.5是小数，定义一个double类型huaShi;
 *      2>摄氏温度也是一个小数，定义一个double类型sheShi;
 *      3>输出；
 */
//敲代码；
		double huaShi = 234.5;
//注意：再java中，数学公式不能直接拿来直接套用，应考虑5/9,5是整数型，9是整数型，5除以9直接将小数位省略掉，所以需要加小数点；		
		double sheShi = 5.0/9*(huaShi - 100);
		System.out.println("华氏温度：" + huaShi + "对应" + sheShi + "摄氏温度"  );
		
	}
}