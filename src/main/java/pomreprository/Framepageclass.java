package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Framepageclass extends Baseclass
{
	public Framepageclass()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@data-target=\"#alerts\"]")
	private WebElement framebox;
	
	@FindBy(xpath="//a[text()='frames']")
	private WebElement frame;
	
	@FindBy(xpath="(//iframe[@src=\"Framelink.html\"])[1]")
	private WebElement iframe;
	
	@FindBy(xpath="(//h1[text()='This is a sample page'])[1]")
	private WebElement frametext;
	
	@FindBy(xpath="//p[contains(text(),'Sample Iframe page There are')]")
	private WebElement parentframetext;
	
	public void frameboxclick()
	{
		explicitwaitforclick(framebox,20);
		click(framebox);
	}	
	public void frameclick()
	{
		explicitwaitforclick(frame,20);
		click(frame);
	}	
	
	public void iframemethod()
	{
		explicitwaitforclick(iframe,20);
		frame(2);
		//frame(iframe);
	}	
	
	public String frametexts()
	{
		explicitwaitforclick(frametext,20);
		return gettext(frametext);
	}	
	public void parentframe() 
	{
		parentframe1();
		
	}
	public String parentframetexts() 
	{
		explicitwaitforclick(parentframetext,20);
		return gettext(parentframetext);
		
	}
	
}
