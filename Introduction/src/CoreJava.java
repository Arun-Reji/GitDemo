
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
		//nested loop
		int k =1;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			//System.out.print(i);
			for(int j=1; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//int m = 1;
		for(int i=1; i<=4; i++) {
			//System.out.print(i);
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print("\t");
				//m++;
			}
			System.out.println();
		}
		
		//-------------------
		int n =3;
		for(int i=0; i<4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(n);
				System.out.print("\t");
				n+=3;
			}
			System.out.println();
		}
		
		int h = 3;
		for(int i=1; i<=3; i++) {
			//System.out.print(i);
			for(int j=1; j<=i; j++) {
				System.out.print(h);
				System.out.print("\t");
				h+=3;
			}
			System.out.println();
		}
		
		
		//ex:1
		
        // outer loop to handle number of rows
//        for (int i = 4; i >= 1; i--) {
//            // inner loop to handle number of columns
//            for (int j = 1; j <= i; j++) {
//                // printing column values upto the row
//                // value.
//                System.out.print(j);
//            }
//
//            // print new line for each row
//            System.out.println();
//        }

	}

}
