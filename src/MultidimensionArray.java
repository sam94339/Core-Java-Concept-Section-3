
public class MultidimensionArray {

	public static void main(String[] args) {
		
		
		//Multidimension array declare type 1
		
		int a[][] = new int[3][3];
		
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 4;
		a[1][0] = 5;
		a[1][1] = 7;
		a[1][2] = 9;
		a[2][0] = 3;
		a[2][1] = 0;
		a[2][2] = 8;
		
		System.out.println(a[0][2]);
		
		//Multidimension array declare type 2
		
		int b[][] = {{2, 3, 4}, {5, 7, 9}};
		
		System.out.println(b[1][1]);
		
		//All Data print
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.println(b[i][j]);
			}
		}
	

	}

}
//2 3 4
//5 7 9
//3 0 8