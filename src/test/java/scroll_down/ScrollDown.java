package scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class ScrollDown extends DriverSetup {
	@Test
	public void ScrollDownInSelenium() throws InterruptedException {
		
		//Navigate to the Website
		driver.get("https://celtabroad.com");
		driver.manage().window().maximize();
		
		
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4500)");
		Thread.sleep(1000);
	
		driver.close();
	}
}
