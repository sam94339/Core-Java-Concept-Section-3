package AbsractClass;

public class AirIndia extends ParentAircraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirIndia flight = new AirIndia();
		flight.color();
		flight.engine();
		flight.safety();

	}

	@Override
	public void color() {
		
		System.out.println("White and red");
		
	}

}
