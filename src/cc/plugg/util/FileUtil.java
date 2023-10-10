package cc.plugg.util;

public class FileUtil {
	
	public static String getFolder() {
		return System.getenv("APPDATA") + "\\plugg\\data\\";
	}

}
