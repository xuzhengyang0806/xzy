public class MulForStar02 {
	public static void main(String[] args) {
		int totalLevel = 20;
		for(int i = 1;i<=totalLevel;i++) {
			for(int k=1;k<=totalLevel-i;k++) {
				System.out.print(" ");
			}
			for(int j =1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
				System.out.print("*");
				}else {
				 System.out.print(" ");	
				}
			}
			System.out.println();
		}
		for(int i = totalLevel-1;i>=1;i--) {
			for(int k=1;k<=totalLevel-i;k++) {
				System.out.print(" ");
			}
			for(int j =1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1) {
				System.out.print("*");
				}else {
				 System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
}