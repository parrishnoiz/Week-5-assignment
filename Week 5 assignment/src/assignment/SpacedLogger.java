package assignment;

public class SpacedLogger implements Logger {

	
	public void log(String str) {
		StringBuilder log = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			log.append(str.charAt(i) + " ");
		}
		System.out.println(log);
	}
	
	
	
	public void error(String str) {
		System.out.println("E R R O R : ");
		log(str);
	}
	
	
	
	

}


