
public class FunctionOverloading {
	
	public void getData(int a) {
		
		System.out.println(a);
	}
	
	public void getData(int a, int b) {
		
		System.out.println(b+a);
	}
	
	public void getData(String a) {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		FunctionOverloading over = new FunctionOverloading();
		over.getData(10);
		over.getData("Soumyadeep");
		over.getData(1, 2);

	}

}
