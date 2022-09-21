package packageFront;

public class Singleton {
	
	// a class that has only one instance/object at a time
	// make constructor private
	//write a public static method that has return type of object of this singeloton class (Lazy initiallization)
	
	private static Singleton singleton_instance= null;
	public String str;
	
	private Singleton(){
		str= " I am creating a singleton class";
		
	}
	
	//Lazy init
	public static Singleton getInstance() {
		if(singleton_instance==null) 
			singleton_instance = new Singleton();
		return singleton_instance;
				
	}
	
	
	public static void main(String[] args) {
		
		Singleton x= Singleton.getInstance();
		// No instance will create, x will repeat
		Singleton y= Singleton.getInstance();
		// No instance will create, x will repeat
		Singleton z= Singleton.getInstance();
		
	    x.str=x.str.toUpperCase();
	    System.out.println(x.str);
	 // upper case only will print, x,y,z points to a single object x.
	    System.out.println(y.str);
	    System.out.println(z.str);
	    
	    z.str = (z.str).toLowerCase();
	    // lower case only will print, x,y,z points to a single object x.
	    System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
