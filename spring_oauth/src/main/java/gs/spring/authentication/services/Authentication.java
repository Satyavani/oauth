package gs.spring.authentication.services;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Authentication implements gs.spring.authentication.Authentication {

	@Override
	public boolean authenticate(String userName, String pwd) {
		
		//TODO: Need to fetch userPwd from the repository
		String userPwd = "";
		String pwdHashed = BCrypt.hashpw(pwd, BCrypt.gensalt(12));		
		if(BCrypt.checkpw(userPwd, pwdHashed)) {
			return true;
		}
		return false;
		
	}

}
