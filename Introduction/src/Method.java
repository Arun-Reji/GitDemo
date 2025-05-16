
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method mm = new Method();
		String name = mm.getData();
		System.out.println(name);
		
		MethodDemo2 m2 = new MethodDemo2();
		String name1 = m2.getUserData();
		System.out.println(name1);

	}
	
	public String getData() {
		System.out.println("Jesus is my Friend");
		return "Jesus";
	}

}
