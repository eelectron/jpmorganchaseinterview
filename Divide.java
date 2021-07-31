public class Divide{
	public static void main(String[] args) {
		Divide dv = new Divide();
		dv.divide(4, 0);
	}

	public int divide(int a, int b){
		int c = -1;

		try{
			c = a / b;
		}catch(Exception ex){
			System.err.print("Exception ");
		}
		finally{
			System.err.println("Finally ");	
		}
		return c;
	}
}