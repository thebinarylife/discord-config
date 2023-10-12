package cc.plugg.util;

import java.util.regex.Pattern;

public class StringUtil {
	
	public static String STRINGS_UTIL_PREFIXES_PLUGG;
	public static String STRINGS_UTIL_PREFIXES_ERROR;
	public static String STRINGS_UTIL_PREFIXES_SUCCESS;
	public static String STRINGS_UTIL_PREFIXES_VALIDATION;
	
	public static String STRINGS_MSGS_WELCOME;
	public static String STRINGS_MSGS_NAME_CONFIRMATION;
	public static String STRINGS_MSGS_CATEGORY;
	public static String STRINGS_MSGS_INSTAGRAM_ASK;
	
	public static String STRINGS_MSGS_EMAIL_CONFIRMATION;
	public static String STRINGS_MSGS_EMAIL_VALID;
	public static String STRINGS_MSGS_EMAIL_INVALID;
	
	public static String STRINGS_MSGS_LOGIN_FINISHED;
	
	private static final String emailRegexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
	private static final String instagramRegexPattern = "^[\\w](?!.*?\\.{2})[\\w.]{1,28}[\\w]$";
	
	public static boolean isValidEmail(String email) {
		return Pattern.compile(emailRegexPattern).matcher(email).matches();
	}
	
	public static boolean isValidInstagramHandle(String handle) {
		return Pattern.compile(instagramRegexPattern).matcher(handle).matches();
	}

}
