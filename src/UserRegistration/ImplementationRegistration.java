package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementationRegistration implements InterfaceRegistration{

	@Override
	public boolean firstName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(firstName);
		return matcher.find();
	}

	@Override
	public boolean lastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.find();
	}

	@Override
	public boolean email(String email) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	@Override
	public boolean mobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.find();
	}

	@Override
	public boolean password(String password) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}
	
	
	
}
