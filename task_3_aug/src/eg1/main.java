package eg1;

public class main {
	
	
	public static void main(String[] args) {
		// this is for the email validation
		valid_Email v = new valid_Email();
		try {
			if (v.valid_email("ujjwalABC12345*")) {
				System.out.println("email is validated");
			}
		} catch (Invalid_email e) {
			System.out.println(e.getMessage());
		}

		// now this is for password validation
		valid_pass p = new valid_pass();
		try {
			if (p.Password_Valid("U1234abcde")) {
				System.out.println("password is validated");
			}
		} catch (invalid_pass e) {
			System.out.println(e.getMessage());
		}

		
		adhar_card ac = new adhar_card();
		try {
			if (ac.isAdharValid("ABCdef12345678")) {
				System.out.println("adhar card is valid");
			}
		} catch (invalid_adhar_card e) {
			System.out.println(e.getMessage());
		}

	}

}
