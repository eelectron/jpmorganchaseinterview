import java.io.IOException;

public class Tester{
	public static void main(String[] args) {
		try{
			new AirJet();
		}catch(IOException ex){
			System.out.println("IOException is thrown in Tester . ");
		}
	}
}

class AirPlane{
	public AirPlane() throws IOException{
		System.out.println("AirPlane");
		throw new IOException();
	}
}

class AirJet extends AirPlane{
	public AirJet() throws IOException{
		System.out.println("Airjet");
		try{
			super();
		}catch(IOException ex){
			System.out.println("IOException is thrown in Tester . ");
		}
	}
}