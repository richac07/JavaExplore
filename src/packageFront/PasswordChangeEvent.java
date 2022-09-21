package packageFront;



import java.sql.Timestamp;


import org.w3c.dom.events.Event;

public class PasswordChangeEvent implements InterfaceEvent{
	private final Long createdTimeStamp;
	private final String id;
	
	public PasswordChangeEvent(String id) {
		this.id=id;
		this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
	}

	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return this.createdTimeStamp;
	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("The customer " + id + " has changed the password at the time " + this.getTimeStamp());
		
	}

}
