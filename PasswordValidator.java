/**
 * 
 */

/**
 * @author braam
 *
 */
public class PasswordValidator {
	public static boolean isValid(String p) {
		if(p.length() >= 5 && p.length() <= 10) {
			return true;
		}
		else {
			return false;
		}
	}
}
