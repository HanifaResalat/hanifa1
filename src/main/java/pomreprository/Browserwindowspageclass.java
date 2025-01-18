package pomreprository;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Browserwindowspageclass extends Baseclass
{
public Browserwindowspageclass() 
{
PageFactory.initElements(driver,this);	
}
@FindBy(xpath="//a[text()='browser windows']")
private WebElement browserwindowsbox;

		@FindBy(xpath="(//a[@target=\"_blank\"])[2]")
		private WebElement newtab;
		
		@FindBy(xpath="//textarea[@class=\"gLFyf\"]")
		private WebElement newtabsendkey;
		
		@FindBy(xpath="//textarea[@class=\"gLFyf\"]")
		private WebElement newwindowsendkey;

		@FindBy(xpath="//a[text()='New Window']")
		private WebElement newwindow;

		@FindBy(xpath="//a[text()='New Window Message']")
		private WebElement newwindowmessage;
		
		public void browserwindowmethod()
		{
			explicitwaitforclick(browserwindowsbox, 20);
			click(browserwindowsbox);
		}
		public void newtab()
		{
			
			explicitwaitforclick(newtab, 20);
			click(newtab);
			windowhandles();
			explicitwaitforclick(newtabsendkey, 20);
			sendkeys(newtabsendkey,"flipkart");
			
		}
		public void browserwindowmethod1() {	
		explicitwaitforclick(newwindow, 20);
			click(newwindow);
			windowhandles();
			driver.manage().window().maximize();
			explicitwaitforclick(newwindowsendkey, 20);
			sendkeys(newwindowsendkey,"amazon");
			
			
		}		
		
		public void newwindowmessagemethod() {
			explicitwaitforclick(newwindowmessage, 20);
			click(newwindowmessage);
			windowhandles();
			driver.manage().window().maximize();
			gettext()//not finding xpath //enter kaise karenge flipkart me?
		}
		
		
		
		
		
		
		

}
