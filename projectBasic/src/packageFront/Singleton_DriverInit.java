package packageFront;

public class Singleton_DriverInit {
	
	private static Singleton_DriverInit driver_init= null;
	
	private Singleton_DriverInit() {
		
	}
	
	public static Singleton_DriverInit driverInit_instance() {
		if (driver_init== null)
			driver_init= new Singleton_DriverInit();
		return driver_init;
	}

}
