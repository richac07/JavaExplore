package packageFront;

public class DigitalOnlyfileReader extends AbstractFiletReader{

	public DigitalOnlyfileReader(String filePath) {
		super(filePath);
	}
	
	@Override
	protected String parseLine (String line) {
		//return line.replaceAll([^0-9], "")
		return line.replaceAll("[^0-9]", "");
		
	}
}
