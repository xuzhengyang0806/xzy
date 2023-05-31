public class WhileBreak {
	public static void main(String[] args) {
/*   分三种情况：
 *   1、剩余钱数大于50000时
 *   2、剩余钱数大于1000，小于50000时 
 *   3、剩余钱数小于1000时 		
 */
		
		double total =100000;
		int count = 0;
		while(true) {
			if(total>50000) {
				total*=0.95;
				count ++;
			}else if(total>1000 && total<=50000){
				total -= 1000;
				count ++;
			}else{
				break;
			}
			
		}
		System.out.println("10000元可以过"+count+"个路口");
	}
}