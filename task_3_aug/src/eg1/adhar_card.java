package eg1;

public class adhar_card {
	
	public boolean isAdharValid(String name) throws invalid_adhar_card {
		if(name!=null && name.matches("[A-Z]{3}[a-z]{3}[0-9]{8}")) {
			return true;
		}else {
			throw new invalid_adhar_card("invalid adhar number " + name + " plz try again after some time");
		}
	}

}
