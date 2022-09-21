package packageFront;

// Create a class for contact details where contacts can have name and number or name number and email id or just name and id.
// This is 	compile time poly, as the same method name is used but with different no of inputs/arguments.

public class PolymExample2 {
	private String name;
	private PhoneNumber phoneNumber;
	private String emailid;
	
	public PolymExample2(String name, PhoneNumber phoneNumber, String emailid) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailid = emailid;
		
	}
	
//overload
	public PolymExample2(String name, PhoneNumber phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	public PolymExample2(String name, String emailid) {
		this.name = name;
		this.emailid = emailid;
		
	}
	
	 @Override
	    public String toString() {
	        return "Contact{" +
	                "name='" + name + '\'' +
	                ", phoneNumber=" + phoneNumber +
	                ", emailAddress='" + emailid + '\'' +
	                '}';
	    }
}
