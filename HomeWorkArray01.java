public class HomeWorkArray01 {
	public static void main(String[] args) {
      //定义数组		
		int arr[] = {10,12,45,90};
      //定义要加入的元素		
		int insertNum=23;
      //定义一个要插入的关键字index		
		int index = -1;
      //遍历数组		
		for(int i= 0;i<arr.length;i++) {
           //如果发现insertNum<arr[i],就说明i是要插入的位置，
           //使用index保留i的位置，然后退出			
			if(insertNum<arr[i]) {
              //23要插入在下表为2的位置，则index=2；				
				index =i;
				break;
			}
          //如果index==-1,则说明没有找到位置，insertNum<arr[i]
          //的情况没有找到，则说明insertNum比任何一个数都大，
          		
			if(index==-1) {
		//要将它放到数组的最后面	
				index=arr.length;
			}
		}
		int arrNew[] =new int [arr.length+1];
      //将原来数组拷贝带到新数组中
      //i控制新数组的下标，j控制原来数组的下标		
		for(int i=0,j=0;i<arrNew.length;i++) {
			if(i!=index) {
				arrNew[i]=arr[j];
				j++;
			}else {
				arrNew[i]=insertNum;
			}
		}
		arr=arrNew;
		System.out.println("========扩容后,arr数组的元素情况========");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}