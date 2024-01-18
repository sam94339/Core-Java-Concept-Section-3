package InterfacePackage;

public class Life implements Bird, Animal{

	public static void main(String[] args) {
		
		Bird b = new Life();
		b.Birdcolor();
		b.Birdspeed();
		b.Birdweight();
		
		Life l = new Life();
		l.lifeMethod();
		
		Animal a = new Life();
		a.animalspeed();
		
		
		
	}
	
	public void Birdcolor() {
		
		System.out.println("Bird color yellow");
		
	}
	public void Birdspeed() {
		
		System.out.println("Bird speed 100");
		
	}
	public void Birdweight() {
		
		System.out.println("Bird speed 10");
	}
	
	public void lifeMethod() {
		
		System.out.println("Test Method");
	}
	
	public void animalspeed() {
		
		System.out.println("Tiger Speed");
	}

}
