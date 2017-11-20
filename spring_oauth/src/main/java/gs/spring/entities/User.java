package gs.spring.entities;

/**
 * User entity
 * @author satyavanig
 *
 */
public class User {
	
	private final String loginId;
	
	private final String pwd;
	
	private String firstName;
	
	private String lastName;
	
	private String displayName;
	
	public User(String loginId, String pwd) {
		
		this.loginId = loginId;
		this.pwd = pwd;
	}
	
	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getDisplayName() {
		return displayName;
	}

	public final void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public final String getLoginId() {
		return loginId;
	}

	public final String getPwd() {
		return pwd;
	}
}
