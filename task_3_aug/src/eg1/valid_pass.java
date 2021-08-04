package eg1;

public class valid_pass {
	
	
	public  boolean Password_Valid(String password) throws invalid_pass {
		if(password!=null && password.matches("[A-Z]{1}[0-9]{4}[a-z]{5}")) {
			return true;
		}else {
			throw new invalid_pass("invalid password " + password +  " please try again");
		}
	}

}
