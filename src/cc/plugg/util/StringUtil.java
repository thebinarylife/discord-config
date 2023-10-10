package cc.plugg.util;

import java.util.regex.Pattern;

public class StringUtil {
	
	public static String WELCOME_MESSAGE;
	public static String XXX;
	public static String YYYY;
	public static String ZZZ;
	
	public static final String emailRegexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
	
	public static boolean isValidEmail(String email) {
		return Pattern.compile(emailRegexPattern).matcher(email).matches();
	}

}
