public class MethodExercise01 {
	public static void main(String[] args) {
		Jordan p = new Jordan();
		p.name = "kobe";
		p.age =100;
		OMO tools = new OMO();
		Jordan p2 = tools.copyPerson(p);
		System.out.println("p的属性 age ="+p.age + "名字="+p.name);
		System.out.println("p2的属性 age ="+p2.age + "名字="+p2.name);
	}
}
class Jordan {
	String name;
	int age;
}
class OMO {
	public Jordan copyPerson(Jordan p) {
		Jordan p2 = new Jordan();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}