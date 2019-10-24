
public class Condicionales {

	public static void main(String[] args) {
		/* Conditions
			
			if, switch.
		
		
			String varColor, varGreen = "Green", varYellow = "Yellow", varRed = "Red";
			varColor = "Green";
			
			if(varColor == varRed) {
				System.out.println("Stop!!!");
				
			}else if(varColor.equals(varYellow)) {
				System.out.println("Prepared");
			}
			
			else if(varColor.equals(varGreen)) {
				System.out.println("Go ahead");
			}
			
			else{
				System.out.println("Wrong value");
			}
		
		*/
		
		String varColor;
		
		varColor = "ajajaja";
		
		switch(varColor) {
			case "Green":
				System.out.println("Go ahead");
			break;
			
			case "Yellow":
				System.out.println("Prepared");
			break;
			
			case "Red":
				System.out.println("Stop!!");
			break;
			
			default:
				System.out.println("Wrong value");
			
			
		}
	}
}