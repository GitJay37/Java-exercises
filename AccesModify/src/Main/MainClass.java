package Main;

public class MainClass {

	public static void main(String[] args) {
		/* Access modify:
		
		*	Default
		*	Public
		*	Private
		*	Protected
		*/
		
		
		User user1 = new User();
		User user2 = new User("Usuario2");
		User user3 = new User("Usuario3"," PassU3");
		
		user1.greet();
		user2.greet();
		user3.greet();
		
		User user = new User("Jay","myPass");
		
		System.out.println(user.username);
		System.out.println( user.getPass() );
	}
}