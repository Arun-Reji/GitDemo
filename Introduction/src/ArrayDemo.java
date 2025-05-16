
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = new int[3];
		int rows = 2;
		int columns = 3;
		int ar[][] = new int[rows][columns] ;
		
				ar[0][0] = 1;
				ar[0][1] = 2;
				ar[0][2] = 3;
				ar[1][0] = 4;
				ar[1][1] = 5;
				ar[1][2] = 7;
				
				
		for (int i = 0 ; i < rows; i++) {
			for (int j = 0; j<columns; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}

	}

}
