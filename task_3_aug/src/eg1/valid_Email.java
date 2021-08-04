package eg1;

public class valid_Email {
	
public boolean valid_email(String email) throws Invalid_email {
		
		if(email!=null && email.matches("[a-z]{6}[A-Z]{3}[0-9]{5}[*]{1}")) {
			return true;
		}else {
			throw new Invalid_email("it is invalid email " + email + " so please try anthor attempt");
		}
		
	}

}
