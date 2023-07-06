/**
 * 
 */
package revisionDay01.solved;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class User {
	private int id;
	private String name;
	private String password;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public static void main(String[] args) {
		User details = new User();
		details.setId(45);
		details.setName("Susikumar");
		details.setPassword("2554345f");
		details.setEmail("susi@gmail.com");
	}
}
