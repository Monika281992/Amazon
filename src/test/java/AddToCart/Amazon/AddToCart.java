package AddToCart.Amazon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import elementsList.AddToCartElements;


public class AddToCart extends Base {

	
	@Test
	public void addtoCart () {
		AddToCartElements se = new AddToCartElements(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		se.SignIn().click();
		se.Email().sendKeys("ch28monika@gmail.com");
		se.password().sendKeys("monika@1234");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", se.SubmitLogin());
		se.SearchBar().sendKeys("dress");		
		se.SubmitButton().submit();
		se.PrintedChiffonDress().click();
		se.AddToCart().submit();
	}
}
