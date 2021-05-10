package FunctionalInterface;

//only one abstract method and default and static method
@FunctionalInterface
interface House{
	
	void ownerMethod();
	
	default String rent(String s) {
		return "House rent "+s;
	}
	
	//cannot override static method
	public static String payment(int amount) {
		return "Rent amount paid " +amount;
		
	}
}

public class HouseImpl implements House{

	public static void main(String[] args) {
		HouseImpl house = new HouseImpl();
		house.ownerMethod();
		System.out.println(house.rent("Test"));
		System.out.println(House.payment(2512));
	}
	
	@Override
	public void ownerMethod() {
		System.out.println("Helo preethi");
	}
	
	public String rent(String s) {
		return "House rent "+s;
	}

}


