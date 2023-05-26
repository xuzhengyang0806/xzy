public class MulForStar {
	public static void main(String[] args) {
//		j控制层数
		for(int j =1;j<=5;j++) {
//      表示每行星星需要空格的数量，总层数-当前层，就是需要空格的数量；			
			for(int k =1;k <=5-j;k++) {
//      双引号中间要空格，" ",表示空格；				
				System.out.print(" ");
			}
//      i控制每层的个数			
			for(int i =1;i<=2*j-1;i++){
//      i==1||i==2*j-1表示第一个或第几个显示*，          
				if(i ==1||i==2*j-1||j==5) {
//println表示每行的每个星星，换行，去掉ln则不换行
				System.out.print("*");
               }else {
            	 System.out.print(" ");
             }
			}
//表示每行星星整体换行		
			System.out.println();
		}
	}
}