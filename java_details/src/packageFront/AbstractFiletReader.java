package packageFront;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

//cannot be called directly by main class. Extend by a subclass and that will be called

// If even one abstract method --> class should be abstract

// @override the abstract class like DigitalFileReader extends AbstactFileReader

//Abstraction is implemented by abstract class, methods and interface.
//In this user hides the unnecessary information using  abstract methods, classes and interface. like TV remote. Each method has its o/p but functionality no one knows
///It focuses on the external lookout.

public abstract class AbstractFiletReader {
	private final Path filePath;
	
	protected AbstractFiletReader(String filePath) {
		this.filePath = Path.of(filePath);
	}
	
	// This is encapsulation, when you are using a private variable and to know its value, you are using getter and setter methods
	//Encapsulation: Private, Public and Protector
	//It focuses on internal working.
	
	public String getPath() {
		return filePath.toString();
	}
	
	public List<String> readFile() throws IOException{
		return Files.lines(filePath).map(this::parseLine).collect(Collectors.toList());
	}

	protected abstract String parseLine(String line);
}
