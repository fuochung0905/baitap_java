package utils;

import java.security.MessageDigest;
import org.apache.tomcat.util.codec.binary.Base64;
public class MaHoa {
	public static String toSHA1(String str) {
		String salt = "asjrlkmcoewj@tjle;oxqskjhdjksjf1jurVn";
		String result = null;
		str = str + salt;
		try {
			byte[] dataBytes = str.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("SHA-1");	
			result = Base64.encodeBase64String((dataBytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
