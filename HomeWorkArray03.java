public class HomeWorkArray03 {
	public static void main(String[] args) {
		//定义一个长度为10的数组，默认值为0
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
        //给数组赋值
        //(int)(Math.random()*100)+1,是1--100之间随机生成数字			
		 arr[i]=(int)(Math.random()*100)+1;	
		}
		System.out.println("=========随机生成的数字为=========");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n=========随机生成倒叙数字=========");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
       //求平均值，最大值，最大值下标
       double sum =arr[0];
       //默认下标为0的数，就是第一个数为最大值；       
       int max =arr[0];
       //默认最大值下标为0;       
       int maxIndex =0;
       for(int i =1;i<arr.length;i++) {
        //因为i是从1开始遍历的，如果求和的话arr[0]第一个数统计不到和里；所以需要先将sum=0改为sum=arr[0];    	  
    	   sum+=arr[i];
       //如果max小于arr[i]则说明max不是最大值    	   
    	   if(max<arr[i]) {
    		   max=arr[i];
    		   maxIndex=i;
    	   }
       }
       System.out.println("\n最大值max="+max+" "+"最大值下标maxIndex="+maxIndex);
       System.out.println("sum="+sum+"平均值="+(sum/10));
	}
}