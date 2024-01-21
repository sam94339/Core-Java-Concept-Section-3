
public class Matrixmaxnumber {
	
	//Find out min value and from the same column find out max value.

	public static void main(String[] args) {
		
		int abc[][] = {{2, 3, 6}, {4, 5, 0}, {4, 9, 1}};
		int min = abc[0][0];
		int column = 0;
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				if(abc[i][j]<min) {
					
					min = abc[i][j];
					column = j;
				}
			}
		}
		
		
		int maxval = abc[0][column]; 
		
		for(int k=0; k<3; k++) {
			
//			System.out.println(abc[k][column]);
			
			if(maxval<abc[k][column]) {
				
				maxval = abc[k][column];
			}
			
		}
		
		System.out.println(maxval);

	}

}
