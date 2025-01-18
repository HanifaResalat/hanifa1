package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Dynamicpropertiespageclass extends Baseclass
{
	public Dynamicpropertiespageclass()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@onclick=\"changeText(this),dynamicproperties();\"]")
	private WebElement dynamicbox;
	
	@FindBy(xpath="//button[@id=\"Enable\"]")
	private WebElement enablevalidate;
	
	@FindBy(xpath="//button[@style=\"color: red;\"]")
	private WebElement colorchang;
	@FindBy(xpath="//button[@style=\"visibility: visible;\"]")
	private WebElement enable;
	
	
	public void dynamicboxmethods() 
	{
		explicitwaitforclick(dynamicbox, 20);
		click(dynamicbox);
	}
	
	public boolean enablemethod() 
	{
		explicitwaitforclick(enablevalidate, 20);
		return gettextenable(enablevalidate);
	}
	
	public boolean enablemethod1() 
	{
		explicitwaitforclick(enable, 20);
		return gettextenable(enable);
	}
	public String colorchangemethod() 
	{
		explicitwaitforclick(colorchang, 20);
		return getcssvalue(colorchang);
	}
	public boolean enablemethod2() 
	{
		explicitwaitforclick(enable, 20);
		return gettextdisplay(enable);
	}
	
}
