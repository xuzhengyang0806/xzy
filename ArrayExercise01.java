public class ArrayExercise01 {
	public static void main(String[] args) {
		char n[] =new char[26];
		for(int i =0;i<n.length;i++) {
//			'A'+i是int类型，需要强制转换
			n[i]=(char)('A'+i);
			
		}
		System.out.println("==========n数组==========:");
	    for(int i = 0;i<n.length;i++) {
	    	System.out.println("第"+(i+1)+"个值是"+n[i]);
	    }
	}
}