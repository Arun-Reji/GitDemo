import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Arun");
		ar.add("Alan");
		ar.add("Chinnu");
		
		//System.out.println(ar.get(0));
		
//		for(int i = 0; i<ar.size(); i++) {
//			System.out.println( ar.get(i));
//		}
		System.out.println("********************");
		
//		for(String j :ar) {
//			System.out.println(j);
//		}
		
		//System.out.println(ar.contains("Arun"));
		
		//normal array
//		String[] a = {"Arun","dfsf","hdbsmf","awdvndb","jhdwd"};
//		List<String> newArray = Arrays.asList(a);
//		System.out.println(newArray.contains("Arun"));
		
		String s = "Arun Reji Pallath";
		String [] arr = s.split("");
		for(int j= arr.length-1; j>=0; j--) {
			System.out.println(arr[j]);
		}
		
		

	}

}
