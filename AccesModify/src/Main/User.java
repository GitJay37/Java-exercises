package Main;

public class User {
	public String username; 
	private String password;
	
	//Constructor
	public User(){
		this.username = "";
		this.password = "";
	}
	
	public User(String username){
		this.username = username;
		this.password = "";
	}
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	
	void greet() {
		System.out.println("Hola mi username is: "+this.username);
	}

	//Getter method
	public String getPass() { // Captura el valor otorgado en el metodo setter
		return password;
	}
		
	// Setter method
	public void setPass(String password) { // Ac� se establece el valor en el parametro
		this.password = password;
	}
	
}


