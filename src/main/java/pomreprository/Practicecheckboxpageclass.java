package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Practicecheckboxpageclass extends Baseclass
{
	public Practicecheckboxpageclass() 
	{
	PageFactory.initElements(driver, this);		
	} 
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@class=\"btn btn-block p-0 text-left\"]")
	private WebElement element;
	
	@FindBy(xpath="//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement iframe;
	
	@FindBy(xpath="//input[@onclick=\"myFunction()\"]")
	private WebElement beforeclickcheckbox;
	


	@FindBy(xpath="//h6[text()='You are selected Mobile']")
	private WebElement checkboxtestafterclick;
	
	
	public void practicemethod() 
	{
		explicitwaitforclick(practice,20);
		click(practice);
	}
	public void elementmethod() 
	{
		explicitwaitforclick(element,20);
		click(element);
	}
	public void checkboxmethod() 
	{explicitwaitforclick(checkbox,20);
		click(checkbox);
	}
	public void iframemethod() 
	{
		explicitwaitforclick(iframe,20);
		frame(iframe);
	}
	
	public void clickcheckboxmethod() 
	{explicitwaitforclick(beforeclickcheckbox,20);
		click(beforeclickcheckbox);
	}
	
	
	public String checkboxvisibilitymethod() 
	{explicitwaitforclick(checkboxtestafterclick,20);
		return gettext(checkboxtestafterclick);
	}
	public boolean checkboxdisplayymethod() 
	{explicitwaitforclick(checkboxtestafterclick,20);
	return	gettextdisplay(checkboxtestafterclick);
	}
	
}
