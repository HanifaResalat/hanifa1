package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Buttonpageclass extends Baseclass
{
	
	public Buttonpageclass()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='buttons']")
	private WebElement button;
	
	@FindBy(xpath="//button[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclick;
	
	@FindBy(xpath="//button[@oncontextmenu=\"righttext()\"]")
	private WebElement contextclick;
	@FindBy(xpath="//button[@onclick=\"clicktext()\"]")
	private WebElement click;
	
	public void clickbuttonmethod() 
	{
		explicitwaitforclick(button, 20);
		click(button);
	}
	
	public void doubleclickmethod() 
	{
		actiondoubleclick(doubleclick);
	}
	
	
	public void contextclickmethod() 
	{
		actioncontextclick(contextclick);
	}
	
	public void clickmethod() 
	{
		explicitwaitforclick(click, 20);
		click(click);
	}
}
