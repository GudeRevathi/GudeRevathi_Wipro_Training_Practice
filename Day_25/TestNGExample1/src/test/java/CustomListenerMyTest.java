import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.example.testNG.CustomListener;
 
@Listeners(CustomListener.class)
public class CustomListenerMyTest {
	@Test
	   public void testSuccess() {
	       System.out.println("Executing testSuccess...");
	   }
	 
	   @Test
	   public void testFail() {
	      System.out.println("Executing testFail...");
	       assert false;
	   }
	   @Test(dependsOnMethods= {"testFail"})
	   public void testSkip() {
		   System.out.println("Executing testSkip....");
	   }

}
