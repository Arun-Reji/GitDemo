
public class Interfacemethods implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new Interfacemethods();
		a.GreenGo();
		a.FlashYellow();
		a.RedStop();

	}

	@Override
	public void GreenGo() {
		System.out.println("Geen to Go");
		
	}

	@Override
	public void RedStop() {
		System.out.println("Red to Stop");
	}

	@Override
	public void FlashYellow() {
		System.out.println("Yellow to wait");
	}

}
