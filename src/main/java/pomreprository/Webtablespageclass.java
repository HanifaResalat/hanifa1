package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Webtablespageclass extends Baseclass
{
	public Webtablespageclass() 
	{
	PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//a[text()='web tables']")
	private WebElement webtablebox;
	@FindBy(xpath="(//iframe[@class=\"embed-responsive-item\"])[2]")
	private WebElement iframe;
	
	@FindBy(xpath="//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
	
	@FindBy(xpath="//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Name:']")
	private WebElement nametext;
	@FindBy(xpath="//label[text()='Email:']")
	private WebElement emailtext;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	
	
	public void webtableboxmethod() 
	{
		explicitwaitforclick(webtablebox, 20);
		click(webtablebox);
	}
	public void iframemethod() 
	{
		frame(iframe);
	}
	public void namemethod() 
	{
		explicitwaitforclick(name,20);
		sendkeys(name,"hanifa");
	}
	
	public void emailmethod() 
	{
		explicitwaitforclick(email,20);
		sendkeys(email,"hanifa@16gmail.com");
	}
	
	public void gettextmethod() 
	{
		explicitwaitforclick(nametext,20);
		gettext(nametext);
		explicitwaitforclick(emailtext,20);
		gettext(emailtext);
	}
	public void savetmethod() 
	{
		explicitwaitforclick(save,20);
		click(save);
	}	
	
}
