public class MiGong2 {
	public static void main(String[] args) {
		int map1[][] = new int[10][9];
		for(int i=0;i<9;i++) {
			map1[0][i]=1;
			map1[9][i]=1;
		}
		for(int i=0;i<10;i++) {
			map1[i][0]=1;
			map1[i][8]=1;
		}
		map1[5][1]=1;
		map1[5][2]=1;
		map1[5][3]=1;
		map1[5][4]=1;
		map1[5][5]=1;
		map1[4][5]=1;
		map1[3][5]=1;
		System.out.println("==========迷宫的情况=========");
		for(int i=0;i<map1.length;i++) {
			for(int j=0;j<map1[i].length;j++) {
				System.out.print(map1[i][j]+"  ");
			}
			System.out.println();
		}
		L l = new L();
		l.findWay2(map1,1,1);
		System.out.println("=========找迷宫的通路情况========");
		for(int i=0;i<map1.length;i++) {
			for(int j=0;j<map1[i].length;j++) {
				System.out.print(map1[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
class L{
	public boolean findWay2(int map1[][],int i,int j) {
		if(map1[8][7]==2) {
			return true;
		}else {
		if(map1[i][j]==0) {
			map1[i][j]=2;
			if(findWay2(map1,i+1,j)) {
			return true;
			}else if(findWay2(map1,i,j+1)) {
				return true;
			}else if(findWay2(map1,i-1,j)) {
				return true;
			}else if(findWay2(map1,i,j-1)) {
				return true;
			}else {
				map1[i][j]=3;
				return false;
			}
		  }else {
				return false;
			}
		 }
	  }
	}
