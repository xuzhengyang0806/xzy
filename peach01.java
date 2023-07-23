public class peach01 {
	public static void main(String[] args) {
		UU u = new UU();
		int day =-2;
		int peachNum =u.peach(day);
		if(peachNum !=-1) {
			System.out.println("当day="+day+"时，还剩"+peachNum+"个桃子");
		}
	}
}
class UU {
	public int peach(int day) {
		if(day==10) {
			return 1;
		}else if(day<=9 && day >=1){
			return (peach(day+1)+1)*2;
		}else {
			System.out.println("请输入day>=1的数字");
			return -1;
		}
	}
}