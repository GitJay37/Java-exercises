package Main;

public class UserClass {
	
	public String username;
	
	public UserClass(String username) {
		this.username = username;
	}
	
	public void setRoll() {
		Admin admin  = new Admin();
		admin.work();
	}
	public class Admin{

		void work() {
			System.out.println("Admin " +username+ " is working!!!");
		}
	}
}
