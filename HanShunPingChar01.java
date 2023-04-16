public class HanShunPingChar01 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97;
		char c5 = 38889;
		char c6 = 'b' + 1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
//		当输出c4时，会输出97表示的字符；
		System.out.println(c4);
//		输出‘a’,对应的数字
		System.out.println((int)c1);
//		输出‘韩’,对应的数字
		System.out.println((int)c3);
//		输出数字对应的字符
		System.out.println(c5);
		System.out.println(c6);
		System.out.println((int)c6);
	}
}