public class Object03{
	public static void main(String[] args) {
		AA a = new AA();
		int res[] = a.getSumAndSub(1,4);
		System.out.println("和等于="+res[0]);
		System.out.println("差等于="+res[1]);
	}
}
class AA{
	public int[] getSumAndSub(int n1,int n2) {
		int arr[] =new int[2];
		arr[0]=n1+n2;
		arr[1]=n1-n2;
		return arr;
	}
}