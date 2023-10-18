package cc.plugg.util;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringUtil {
	
	public static String STRINGS_UTIL_PREFIXES_PLUGG;
	public static String STRINGS_UTIL_PREFIXES_ERROR;
	public static String STRINGS_UTIL_PREFIXES_SUCCESS;
	public static String STRINGS_UTIL_PREFIXES_VALIDATION;
	
	public static String STRINGS_INDICATOR_EMAIL;
	
	public static String STRINGS_MSGS_REGISTRATION_WELCOME;
	
	public static ArrayList<String> STRINGS_MSGS_REGISTRATION_NAME_CONFIRMATION;
	
	public static String STRINGS_MSGS_REGISTRATION_EMAIL_PROMPT;
	public static String STRINGS_MSGS_REGISTRATION_EMAIL_CONFIRM;
	public static String STRINGS_MSGS_REGISTRATION_EMAIL_CONFIRMED;
	public static String STRINGS_MSGS_REGISTRATION_EMAIL_SUBSCRIBE;
	public static String STRINGS_MSGS_REGISTRATION_EMAIL_INVALID;
	
	public static String STRINGS_MSGS_REGISTRATION_INSTAGRAM_PROMPT;
	public static String STRINGS_MSGS_REGISTRATION_INSTAGRAM_CONFIRMED;
	public static String STRINGS_MSGS_REGISTRATION_INSTAGRAM_INVALID;
	
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_MSG;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_FRIEND_DESCRIPTION;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_FRIEND_EMOJI;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_PRODUCER_DESCRIPTION;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_PRODUCER_EMOJI;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_ARTIST_DESCRIPTION;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_ARTIST_EMOJI;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_AR_DESCRIPTION;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_AR_EMOJI;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_GA_DESCRIPTION;
	public static String STRINGS_MSGS_REGISTRATION_CATEGORY_GA_EMOJI;
	
	public static String STRINGS_MSGS_REGISTRATION_LOGIN_FINISHED;
	
	private static final String emailRegexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
	private static final String instagramRegexPattern = "^[\\w](?!.*?\\.{2})[\\w.]{1,28}[\\w]$";
	
	public static boolean isValidEmail(String email) {
		return Pattern.compile(emailRegexPattern).matcher(email).matches();
	}
	
	public static boolean isValidInstagramHandle(String handle) {
		return Pattern.compile(instagramRegexPattern).matcher(handle).matches();
	}
	
	public static boolean isClean(String phrase) {
		phrase.toLowerCase().replaceAll("3", "e").replaceAll("!", "i").replaceAll("@", "a");
		
		if(phrase.contains("shit") || phrase.contains("nigger") || phrase.contains("nigga") || phrase.contains("cunt")
				|| phrase.contains("gay"))
			return false;
		
		return true;
	}


}
