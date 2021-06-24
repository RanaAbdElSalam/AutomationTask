package Pages;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddingToCartPage extends Page_Base {
	
	public String[] addingToCartMethod() throws InterruptedException, IOException {
		

		WebDriver driver = webDriver();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	
		WebElement womenSection = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));

	    clickButton(womenSection);
	    
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		scrollToBottom();
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		
		WebElement product1Img = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img"));
		clickButton(product1Img);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
		WebElement productPrice = driver.findElement(By.id("our_price_display"));
		String priceValue = productPrice.getText();

		WebElement productAddingToCart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button"));
		clickButton(productAddingToCart);
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		WebElement continueShoppingButton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));
		clickButton(continueShoppingButton);
		
		Actions actions = new Actions(driver);
		WebElement cartMenu = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")); 
		actions.moveToElement(cartMenu).perform();
		  
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		  
		WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/p[2]/a"));
		clickButton(checkoutButton);

		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		  
		WebElement totalProductsPrice = driver.findElement(By.id("total_product"));
		String totalPriceValue = totalProductsPrice.getText();
		  
		String[] values = new String[2]; 		
		values[0] = priceValue;
	    values[1] = totalPriceValue;
			
		return values;


}
}
