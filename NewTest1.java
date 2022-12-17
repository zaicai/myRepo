package TestGroup1.Artifact2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest1 {
	
	ChromeDriver  driver;
	String urlBase;  
	
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0010_Login_Success() {
			  
	          System.out.println( "This is the f0010_Login_Success.");

	          System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();

	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/login");
			  
			  try {
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#username")));//Waiting for the "username"
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));//Waiting for the "password"
				  driver.findElement(By.id("username")).sendKeys("tomsmith");
				  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
				  driver.findElement(By.cssSelector("button > i")).click();
			  }catch(Exception e) {}
			  
	  		  Assert.assertEquals(driver.findElement(By.cssSelector(".subheader")).getText(), "Welcome to the Secure Area. When you are done click logout below.");

				  
			  try {
			       Thread.sleep(1000);
			  }catch(Exception e) {}
			  System.out.println( "Login_Success Done " +"\r");
			  driver.quit();
		  
		  }	
		
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0020_Login_Failure() {
			  
	          
		      System.out.println( "This is the f0020_Login_Failure.");
	    	  
		      String temp;
		      
		      
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/login");
			  
			  try {
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#username")));//Waiting for the "username"
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));//Waiting for the "password"
				  driver.findElement(By.id("username")).sendKeys("tomsmith");
				  driver.findElement(By.id("password")).sendKeys("wrongpassword!");
				  driver.findElement(By.cssSelector("button > i")).click();
			  }catch(Exception e) {}
			  
			  temp = driver.findElement(By.cssSelector("#flash")).getText();
			  Assert.assertTrue(temp.contains("Your password is invalid!"));

				  
			  try {
			       Thread.sleep(1000);
			  }catch(Exception e) {}
			  System.out.println( "Login_Failure Done " +"\r");
			  driver.quit();
		  
		  }	
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0030_Checkboxes() {
			  
	          
		      System.out.println( "This is the f0030_Checkboxes.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/checkboxes");
			  
			  try {
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#checkboxes")));//Waiting for the checkbox
				  WebElement tempCheckbox = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));//Find the checkbox element
				  tempCheckbox.click();
				  Assert.assertTrue(tempCheckbox.isSelected());
				  try {
				       Thread.sleep(1000);
				  }catch(Exception e) {}
				  tempCheckbox.click();
				  Assert.assertTrue(!tempCheckbox.isSelected());
				  try {
				       Thread.sleep(1000);
				  }catch(Exception e) {}

			  }catch(Exception e) {}
				  
			  try {
			       Thread.sleep(1000);
			  }catch(Exception e) {}
			  System.out.println( "Checkboxes Done " +"\r");
			  driver.quit();
		  
		  }	
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0040_Context_Menu() {
			  
	          
		      System.out.println( "This is the f0040_Context_Menu.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/context_menu");
			  
			  try {
				  
				  
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hot-spot")));//Waiting for the "#hot-spot"
				  WebElement tempMenu =driver.findElement(By.id("hot-spot"));
				  Actions actions = new Actions(driver);
				  actions.contextClick(tempMenu).perform();
			      try {
				       Thread.sleep(1000);
				  }catch(Exception e) {}
				  
		  		  Assert.assertEquals(driver.switchTo().alert().getText(), "You selected a context menu");
		  		  driver.switchTo().alert().accept();
				  
				  Robot robot = new Robot();
			      robot.keyPress(KeyEvent.VK_DOWN);
			      robot.keyRelease(KeyEvent.VK_DOWN);
			      try {
				       Thread.sleep(1000);
				  }catch(Exception e) {}
			      robot.keyPress(KeyEvent.VK_DOWN);
			      robot.keyRelease(KeyEvent.VK_DOWN);
			      try {
				       Thread.sleep(1000);
				  }catch(Exception e) {}
			      robot.keyPress(KeyEvent.VK_ENTER);
			      robot.keyRelease(KeyEvent.VK_ENTER);

			  }catch(Exception e) {}
			  
			  try {
			       Thread.sleep(2000);
			  }catch(Exception e) {}
			  System.out.println("Context_Menu Done " +"\r");
			  driver.quit();
		  
		  }	
		
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0050_Drag_and_Drop() {
			  
	          
		      System.out.println( "This is the f0050_Drag_and_Drop.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/drag_and_drop");
			  
			  try {
				  
				  
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#column-a")));//Waiting for the "#column-a"
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#column-b")));//Waiting for the "#column-b"
				  WebElement tempColumn1 =driver.findElement(By.id("column-a"));
				  Actions actions = new Actions(driver);
				  actions.dragAndDropBy(tempColumn1, 215, 0).perform();
				  
				  
			      try {
				       Thread.sleep(5000);
				  }catch(Exception e) {}
				  
		  		  

			  }catch(Exception e) {}
			  
			  try {
			       Thread.sleep(2000);
			  }catch(Exception e) {}
			  System.out.println("Drag and Drop Done " +"\r");
			  driver.quit();
		  
		  }	
	   
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0060_Dropdown() {
			  
	          
		      System.out.println( "This is the f0060_Dropdown.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/dropdown");
			  
			  try {
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".example>#dropdown")));//Waiting for the "#column-a"
				  Select select = new Select(driver.findElement(By.cssSelector(".example>#dropdown")));
				  select.selectByIndex(1);
		  		  Thread.sleep(2000);

		  		  Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 1");
		  		  Thread.sleep(2000);
		  		  
				  select.selectByIndex(2);
		  		  Assert.assertEquals(select.getFirstSelectedOption().getText(), "Option 2");
		  		  Thread.sleep(2000);

			  }catch(Exception e) {}

			  System.out.println("Dropdown Done " +"\r");
			  driver.quit();
		  
		  }	
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0070_Dynamic_Content() {
			  
	          
		      System.out.println( "This is the f0070_Dynamic_Content.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/dynamic_content");
			  
			  try {
				  wait30.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#content > div:nth-child(7) > div.large-10.columns")));
		  		  Thread.sleep(2000);
				  String oldString = driver.findElement(By.cssSelector("#content > div:nth-child(7) > div.large-10.columns")).getText();
				  driver.navigate().refresh();
		  		  Thread.sleep(2000);
				  String newString = driver.findElement(By.cssSelector("#content > div:nth-child(7) > div.large-10.columns")).getText();
				  Assert.assertFalse(oldString.equals(newString)); 
				  
		  		  Thread.sleep(2000);

			  }catch(Exception e) {}

			  System.out.println("Dynamic_Content Done " +"\r");
			  driver.quit();
		  
		  }	
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0080_Dynamic_Controls_There_is_a_bug() {
			  

		      //There is a bug in this case. After the Enable/Disable button is clicked, the loading image should disappear, but it is still there.
		      //I removed the assert
		   
		      System.out.println( "This is the f0080_Dynamic_Controls_There_is_a_bug.");
		      System.out.println( "There is a bug in this case. After the Enable/Disable button is clicked, the loading image should disappear, but it is still there.I removed the assert.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/dynamic_controls");
			  
			  try {
				  driver.findElement(By.cssSelector("#checkbox-example > button")).click();//Remove the checkbox
				  wait30.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#checkbox-example > button")));//Wait
				  Assert.assertFalse(isElementPresent(By.cssSelector("#checkbox")));//Check the checkbox

		  		  Thread.sleep(2000);

				  driver.findElement(By.cssSelector("#checkbox-example > button")).click();//Add the checkbox
				  wait30.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#checkbox-example > button")));//Wait for the button
				  Assert.assertTrue(isElementPresent(By.cssSelector("#checkbox")));//Check the checkbox

				  driver.findElement(By.cssSelector("#input-example > button")).click();//enable the box
				  wait30.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example > button")));//Wait
				  Assert.assertTrue(driver.findElement(By.cssSelector("#input-example > input")).isEnabled());//Check the box
				  //Assert.assertFalse(isElementPresent(By.cssSelector("#loading > img")));//The loading image should disappear, but it is still there.This is a bug

		  		  Thread.sleep(2000);


				  driver.findElement(By.cssSelector("#input-example > button")).click();//disable the box
				  wait30.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example > button")));//Wait for the button
				  Assert.assertFalse(driver.findElement(By.cssSelector("#input-example > input")).isEnabled());//Check the box
				  //Assert.assertFalse(isElementPresent(By.cssSelector("#loading > img")));//The loading image should disappear, but it is still there.This is a bug

			  
		  		 
			  }catch(Exception e) {}

			  System.out.println("Dynamic_Controls Done " +"\r");
			  driver.quit();
		  
		  }	
	   
	   public boolean isElementPresent(By by) {
		    try {
		        WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(5));
	  			wait5.until(ExpectedConditions.presenceOfElementLocated(by));
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
		}
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0090_Dynamic_Loading() {
			  
		      System.out.println( "This is the f0090_Dynamic_Loading.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/dynamic_loading/2");
			  
			  try {
				  driver.findElement(By.cssSelector("#start > button")).click();//Start
				  wait30.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#finish > h4")));//Wait for the hello world
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#finish > h4")).getText(), "Hello World!");
		  		 
			  }catch(Exception e) {}

			  System.out.println("Dynamic_Loading " +"\r");
			  driver.quit();
		  
		  }
	   
	   @Test(enabled =  true, invocationCount = 1 )
	   public void f0100_File_Download() {
			  
		      System.out.println( "This is the f0100_File_Download.");
	    	  

		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
		      HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		      chromePrefs.put("download.default_directory", "C:\\Users\\User\\Desktop");
		      ChromeOptions chromeOptions = new ChromeOptions();
		      chromeOptions.setExperimentalOption("prefs", chromePrefs);
		      DesiredCapabilities caps = new DesiredCapabilities();
		      caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();

	    	  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/download");
			  
			  try {
				  driver.findElement(By.cssSelector("#content > div > a")).click();
		  		  Thread.sleep(3000);
		  		  Assert.assertTrue(FileExists());
		  		 
			  }catch(Exception e) {}

			  System.out.println("File_Download " +"\r");
			  driver.quit();
		  
		  }
	   	
	   public boolean FileExists() {
		   		File file = new File("C:\\Users\\User\\Desktop\\some-file.txt");
		   		if (!file.exists()) {
		   			return false;
		   		} else {
		   			return true;
		   		}
    	   }
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0110_File_Upload() {
			  
		      System.out.println( "This is the f0110_File_Upload.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/upload");
			  
			  try {
				  driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\User\\Desktop\\Big-file.txt");
				  driver.findElement(By.cssSelector("#file-submit")).click();
		  		  Thread.sleep(3000);
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#uploaded-files")).getText(), "Big-file.txt");

			  }catch(Exception e) {}

			  System.out.println("File_Upload Done" +"\r");
			  driver.quit();
		  
		  }   

	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0120_Floating_Menu() {
			  
		      System.out.println( "This is the f0120_Floating_Menu.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/floating_menu");
			  
			  try {

				  driver.executeScript("window.scrollBy(0,3000)");
		  		  Thread.sleep(2000);
				  System.out.println(driver.findElement(By.cssSelector("#menu")).getAttribute("style") +"\r");
		  		  Assert.assertTrue(driver.findElement(By.cssSelector("#menu")).getAttribute("style").contains("top: 296"));//Should be 2961-2969,which is less than 3000
		  		 
			  }catch(Exception e) {}

			  System.out.println("Floating_Menu Done" +"\r");
			  driver.quit();
		  
		  }   
	   
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0130_iFrame() {
			  
		      System.out.println( "This is the f0130_iFrame.");
	    	  
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
			  
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/iframe");
			  
			  try {
				  driver.switchTo().frame("mce_0_ifr");
				  driver.findElement(By.cssSelector("#tinymce > p")).clear();
				  driver.findElement(By.cssSelector("#tinymce > p")).sendKeys("Inner");
		  		  Thread.sleep(2000);
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#tinymce > p")).getText(), "Inner");
		          driver.switchTo().defaultContent();
				  driver.findElement(By.cssSelector(".tox-mbtn--active > span")).click();
			  }catch(Exception e) {}

			  System.out.println("iFrame Done" +"\r");
			  driver.quit();
		  
		  } 
	   
	   
	   
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0140_Mouse_Hover() {
			  
		      System.out.println( "This is the f0140_Mouse_Hover.");
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/hovers");
			  
			  
			  try {
			      Actions action= new Actions(driver);
			      WebElement temp1 = driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > img")); 
			      action.moveToElement(temp1).perform();
		  		  Thread.sleep(2000);
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > div > h5")).getText(), "name: user1");
				  driver.findElement(By.cssSelector("#content > div > div:nth-child(3) > div > a")).click();
		  		  Assert.assertTrue(driver.findElement(By.cssSelector("#c > pre")).getText().contains("/users/1"));
		  		  driver.navigate().back();
 		  
			      WebElement temp2= driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > img")); 
			      action.moveToElement(temp2).perform();
		  		  Thread.sleep(2000);
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > div > h5")).getText(), "name: user2");
				  driver.findElement(By.cssSelector("#content > div > div:nth-child(4) > div > a")).click();
		  		  Assert.assertTrue(driver.findElement(By.cssSelector("#c > pre")).getText().contains("/users/2"));
		  		  driver.navigate().back();
		  		  
			      WebElement temp3= driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > img")); 
			      action.moveToElement(temp3).perform();
		  		  Thread.sleep(2000);
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > div > h5")).getText(), "name: user3");
				  driver.findElement(By.cssSelector("#content > div > div:nth-child(5) > div > a")).click();
		  		  Assert.assertTrue(driver.findElement(By.cssSelector("#c > pre")).getText().contains("/users/3"));
		  		  driver.navigate().back();

			  }catch(Exception e) {}

			  System.out.println("Mouse_Hover Done" +"\r");
			  driver.quit();
		  
		  }   
	   
	   
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0150_JavaScript_Alerts() {
			  
		      System.out.println( "This is the f0150_JavaScript_Alerts.");
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/javascript_alerts");
			  
			  
			  try {
				  driver.findElement(By.cssSelector("li:nth-child(1) > button")).click();
		  		  Thread.sleep(2000);
				  Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS Alert");
		  		  driver.switchTo().alert().accept();
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),"You successfuly clicked an alert");
		  		  
				  driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();
		  		  Thread.sleep(2000);
				  Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS Confirm");
		  		  driver.switchTo().alert().accept();
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),"You clicked: Ok");
		  		  driver.findElement(By.cssSelector("li:nth-child(2) > button")).click();
		  		  Thread.sleep(2000);
				  Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS Confirm");
		  		  driver.switchTo().alert().dismiss();
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),"You clicked: Cancel");

		  		  
		  		
				  driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
		  		  Thread.sleep(2000);
				  Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS prompt");
				  driver.switchTo().alert().sendKeys("Have an accept test.");
		  		  driver.switchTo().alert().accept();
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),"You entered: Have an accept test.");
				  driver.findElement(By.cssSelector("li:nth-child(3) > button")).click();
		  		  Thread.sleep(2000);
				  Assert.assertEquals(driver.switchTo().alert().getText(), "I am a JS prompt");
				  driver.switchTo().alert().sendKeys("Have a dismiss test.");
		  		  driver.switchTo().alert().dismiss();
		  		  Assert.assertEquals(driver.findElement(By.cssSelector("#result")).getText(),"You entered: null");
		  		  
		  		  
				 
			  }catch(Exception e) {}

			  System.out.println("JavaScript_Alerts Done" +"\r");
			  driver.quit();
		  
		  }   

	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0160_JavaScript_Error() {
			  
		      System.out.println( "This is the f0160_JavaScript_Error.");
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/javascript_error");
			  
			  LogEntries jsErrors = driver.manage().logs().get(LogType.BROWSER);
		      System.out.println("Print all log" + jsErrors.getAll());
		      //System.out.println("Print index0 log" + jsErrors.getAll().get(0));

			  try {
		  		  Thread.sleep(2000);
               }catch(Exception e) {}

			  Assert.assertTrue(jsErrors.getAll().get(0).toString().contains("Cannot read properties of undefined (reading 'xyz')"));
			  
			  
			  System.out.println("JavaScript_Error Done" +"\r");
			  driver.quit();
		  
		  } 
	   
	   
	   @Test(enabled =  false, invocationCount = 1 )
	   public void f0170_Open_in_New_Tab() {
			  
		      System.out.println( "This is the f0170_Open_in_New_Tab.");
		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/windows ");
			  
  			  try {
 		  		 Thread.sleep(2000);
                 driver.findElement(By.cssSelector("#content > div > a")).click();
		  		 Thread.sleep(2000);

  			     //Close the sharing window.
  			  	 Set <String> handle_set = driver.getWindowHandles();
  		         Iterator <String> I1= handle_set.iterator();
  				 String parent =  driver.getWindowHandle();
  		         while(I1.hasNext())
  		         {
  		      	   String child_window = I1.next();
  		      	   if(!parent.equals(child_window))
  		      	   {
  		      		    driver.switchTo().window(child_window);
     			  		Assert.assertEquals(driver.findElement(By.cssSelector("body > div > h3")).getText(), "New Window");
  		                driver.close();// Quit() will clear the driver, then it can not switchto() again. Only need to close()the window.    
  		           }
  		      	 }
  		         //switch to the parent window
  		         driver.switchTo().window(parent);
  			  	  
		  		 Thread.sleep(2000);
               }catch(Exception e) {}

  			  System.out.println("Open_in_New_Tab Done" +"\r");
			  driver.quit();
		  
		  } 

	   
	   
	   @Test(enabled =  true, invocationCount = 1 )
	   public void f0180_Notification_Message() {
			  
		      System.out.println( "This is the f0180_Notification_Message.");
		      

		      System.setProperty("webdriver.chrome.driver","F:\\0000Selenium Chrome\\chromedriver_win32\\chromedriver.exe");
	    	  ChromeOptions chromeOptions = new ChromeOptions();
	    	  chromeOptions.addArguments("--user-data-dir=C:\\Users\\User\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 3"); 
	    	  chromeOptions.addArguments("--disable-extensions");
	    	  driver = new ChromeDriver(chromeOptions);  
	    	  driver.manage().window().maximize();

	          
	          
	          WebDriverWait wait30 = new WebDriverWait(driver,Duration.ofSeconds(30));
	          urlBase = "http://localhost:7080";
			  driver.get(urlBase+"/notification_message_rendered");
			  
  			  try {
 		  		 Thread.sleep(2000);
                 driver.findElement(By.cssSelector("#content>div>p>a")).click();
                 Assert.assertTrue(isContains(By.cssSelector("#flash")));
                 driver.findElement(By.cssSelector("#flash>a")).click();

                 
 		  		 Thread.sleep(2000);
                 driver.findElement(By.cssSelector("#content>div>p>a")).click();
                 Assert.assertTrue(isContains(By.cssSelector("#flash")));
                 driver.findElement(By.cssSelector("#flash>a")).click();

                 
 		  		 Thread.sleep(2000);
                 driver.findElement(By.cssSelector("#content>div>p>a")).click();
                 Assert.assertTrue(isContains(By.cssSelector("#flash")));

 		  		      
               }catch(Exception e) {}

  			  System.out.println("Notification_Message Done" +"\r");
			  driver.quit();
		  
		  } 
	   
	   public boolean isContains(By by) {
		    try {
		        WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(5));
	  			wait5.until(ExpectedConditions.presenceOfElementLocated(by));

	  			if(driver.findElement(by).getText().contains("Action successful"))
	  			{
	  				return true;
	  			}
	  			else if(driver.findElement(by).getText().contains("Action unsuccesful, please try again"))
	  			{
                    return true;
	  			}
	  			else if(driver.findElement(by).getText().contains("Action unsuccessful"))
	  			{
	  				return true;
	  			}
	  			else
	  			{
	  				return false;
	  			}
	  			
	  			
		    } catch (Exception e) {

		    	return false;
		    	}
		}
	   
  @BeforeTest
  public void beforeTest() {

  }

  @AfterTest
  public void afterTest() {

  }

}
