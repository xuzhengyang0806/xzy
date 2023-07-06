public class ObjectExercise02{
	public static void main(String[] args) {
		DD d = new DD();
		d.print(10,10,'#');
	}
}
class DD{
	public void print(int row,int col,char c) {
		for(int i =0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}