package assignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("This is an error.");
		
		System.out.println();
		
		
		spacedLogger.log("Spread this out.");
		spacedLogger.error("This is an error");
		

	}

}
