package gs.spring.exp;

import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class TempBCrypt {
	
	public static boolean authenticate(String userPwd){
		String pwd = "mine_mine";		
		String pwdHashed = BCrypt.hashpw(pwd, BCrypt.gensalt(12));		
		if(BCrypt.checkpw(userPwd, pwdHashed)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		try(Scanner in = new Scanner(System.in)) {
			String userPwd = in.next();
		
			if(authenticate(userPwd))
				System.out.println("Your pwd is matching with us");
			else
				System.out.println("Your Pwd is not matching with us");
		}		
	}

}
