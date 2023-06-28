public class Object01 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		p1.cal02(10);
		int returnRes =p1.getSum(50, 20);
		System.out.println("getSum方法返回的值="+returnRes);
	
	}
}
class Person{
	int age;
	String name;
	public void speak() {
		System.out.println("我是中国人");
	}
	public void cal01() {
		int res =0;
		for(int i =1;i<=1000;i++) {
			res += i;
		}
		System.out.println("1到1000的和等于="+res);
	}
	public void cal02(int n) {
		int res =0;
		for(int i=1;i<=n;i++) {
			res +=i;
		}
		System.out.println("cal02的和="+res);
	}
	public int getSum(int num1,int num2) {
		int res =num1+num2;
		return res;
	}
}

