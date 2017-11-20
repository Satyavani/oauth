package gs.spring.authentication;

public interface Authentication {
	
	boolean authenticate(String userName, String pwd);

}
