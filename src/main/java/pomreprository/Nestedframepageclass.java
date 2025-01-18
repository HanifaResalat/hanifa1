package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Nestedframepageclass  extends Baseclass
{
	public Nestedframepageclass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='nested frames']")
	private WebElement nestedframebox;
	@FindBy(xpath="//iframe[@src=\"target1.html\"]")
	private WebElement iframemainpage;
	@FindBy(xpath="//iframe[@src=\"text.html\"]")
	private WebElement iframeparent;
	@FindBy(xpath="//iframe[@src=\"example.html\"]")
	private WebElement iframechild;
	
	@FindBy(xpath="//h2[text()='Parent']")
	private WebElement parentframetext;
	
	@FindBy(xpath="//h2[text()='Child']")
	private WebElement childframetext;
	@FindBy(xpath="//a[text()='Click Here']")
	private WebElement clickhere;
	@FindBy(xpath="//p[text()='Hello']")
	private WebElement hellotext;
	
	public void nestedframemethod() 
	{
		explicitwaitforclick(nestedframebox, 20);
		click(nestedframebox);
		frame(iframemainpage);
		frame(iframeparent);
	
		System.out.println(gettext(parentframetext));
		frame(iframechild);
		System.out.println(gettext(childframetext));
		
		
		click(clickhere);
	System.out.println(gettext(hellotext));
		
	}
	
	
	
	
}
