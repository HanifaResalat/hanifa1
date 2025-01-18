package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class coursebox extends Baseclass
{
	public coursebox()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id=\"navbarDropdownMenuLink\"]")
	private WebElement courseclick;
	
	@FindBy(xpath="//a[text()='UI/Full Stack Development']")
	private WebElement uiclick;
	
	public void coursemethod() 
	{
		explicitwaitforclick(courseclick, 20);
		click(courseclick);
		explicitwaitforclick(uiclick, 20);
		click(uiclick);
	}
	
}