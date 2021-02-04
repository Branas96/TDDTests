/**
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author braam
 *
 */
public class TestPassword {
@Test
	public void TestPasswordLength() {
	Assert.assertEquals(true, PasswordValidator.isValid("Abc123"));
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPassword t = new TestPassword();
		t.TestPasswordLength();
	}

}
