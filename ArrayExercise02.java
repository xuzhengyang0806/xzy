public class ArrayExercise02 {
	public static void main(String[] args) {
//分析：1、定义一个int arr[] ={4,-1,9,10,23}的数组;
//	  2、假设int max = arr[0]为最大值，最大值下标int maxIndex=0;
//		如果max<当前元素，则max替换成当前元素，最大下标则替换成当前下标。
		int arr[] = {4,-1,9,10,23};
		int max =arr[0];
		int maxIndex = 0;
		for(int i =1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println("max=" +max+"maxIndex="+maxIndex);
	}
}