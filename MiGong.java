public class MiGong {
	public static void main(String[] args) {
		int map[][] = new int[8][7];
		for(int i =0;i<7;i++) {
			map[0][i]=1;
			map[7][i]=1;
		}
		for(int i=0;i<8;i++) {
			map[i][0]=1;
			map[i][6]=1;
		}
		map[3][1]=1;
		map[3][2]=1;
		System.out.println("=======迷宫的情况是=======");
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+"  ");
			}
			System.out.println();
		}
		M m = new M();
		m.findWay(map,1,1);
		System.out.println("========找路的情况如下=======");
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
class M {
	public boolean findWay(int map[][],int i,int j) {
		if(map[6][5]==2) {
			return true;
		}else {
            //当前位置为0，说明表示可以走			
			if(map[i][j]==0) {
              //假定能走通				
				map[i][j]=2;
              //使用找路策略，来确定该位置是否真的可以走通
              //从下->右->上->左
				if(findWay(map,i+1,j)) {
					return true;
				}else if(findWay(map,i,j+1)){
					return true;
				}else if(findWay(map,i-1,j)) {
					return true;
				}else if(findWay(map,i,j-1)) {
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
              //map[i][j]=1,2,3					
			 }else {
				return false;
			}
		  }
		}
}