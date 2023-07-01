public class Object02{
	public static void main(String[] args) {
		int[][] map= {{0,0,1},{1,1,1},{1,1,3}};
		MyTools myTools = new MyTools();
		myTools.printArr(map);
		myTools.printArr(map);
		myTools.printArr(map);
	}
}

class MyTools{
	public void printArr(int[][] map) {
		for(int i=0;i<map.length;i++) {
		 for(int j=0;j<map[i].length;j++) {
			System.out.print(map[i][j]+"\t");
			}
			System.out.println();
			System.out.println("==================");
		}
	}
}