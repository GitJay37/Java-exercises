package main;

public class CondicionesAnidadas {

	public static void main(String[] args) {
		/* Nested conditions:
		
		*	To success this exam your note must be grater than 3.0
		*	0 to 0.99 is deficient
		*	1.0 to 2.99 is insufficient
		*	3.0 to 3.99 is acceptable
		*	4.0 to 4.99 is outstanding
		*	5.0 is excellent
		*/
		
		float note = 5.0f;
		
		if(note == 5){
			System.out.println(" Your note is: "+note+" Excellent!! Congratulations!!! :D");
			
		}else if(note >= 4 && note <= 5 ){
			System.out.println(" Your note is: "+note+" that's outstanding goog job. ;)");
		
		}else if(note >= 3 && note <= 4 ){
			System.out.println(" Your note is: "+note+" that's acceptable keep learnig. :)");
		}
		
		else if(note >= 1 && note <= 3.0 ){
			System.out.println(" Your note is: "+note+" that's insufficient, try again. :(");
		}
		
		else if(note >= 0 && note <= 1.0 ){
			System.out.println(" Your note is: "+note+" that's deficient. :'( ");
		}
		
		else {
			System.out.println("Wrong data");
		}

	}
}