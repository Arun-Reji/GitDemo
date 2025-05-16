
public class IInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Arun12\11\2025sjdhsj";
		// Regular expression to match digits
        String regex = "\\d";
        // Replace all digits with an empty string
        str = str.replaceAll(regex,"");
        String regec = "\\s";
        System.out.println(str.replaceAll(regec, ""));
	}

}
