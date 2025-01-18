package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Modaldialogspageclass extends Baseclass
{
public Modaldialogspageclass() 
{
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='modal dialogs']")
private WebElement modaldialogbox;
@FindBy(xpath="//div[text()='Click on button to see modal']")
private WebElement modaldialogboxtext;
@FindBy(xpath="//button[@data-target=\"#exampleModal1\"]")
private WebElement smallmodalclick;
@FindBy(xpath="(//div[@class=\"modal-body\"])[2]")
private WebElement smallemodaltext;
@FindBy(xpath="(//button[@data-dismiss=\"modal\"])[4]")
private WebElement smallemodaltextclose;
@FindBy(xpath="//button[@data-target=\"#exampleModal2\"]")
private WebElement largemodalclick;
@FindBy(xpath="(//span[text()='×'])[3]")
private WebElement largemodalross;
		

public void modalmethod() 
{
	explicitwaitforclick(modaldialogbox, 20);
	click(modaldialogbox);
	explicitwaitforclick(modaldialogboxtext, 20);
	System.out.println(gettext(modaldialogboxtext));
	explicitwaitforclick(smallmodalclick, 20);
	click(smallmodalclick);
	explicitwaitforclick(smallemodaltext, 20);
	System.out.println(gettext(smallemodaltext));
	explicitwaitforclick(smallemodaltextclose, 20);
	click(smallemodaltextclose);
	explicitwaitforclick(largemodalclick, 20);
	click(largemodalclick);
	explicitwaitforclick(largemodalross, 20);
	click(largemodalross);
	
}
}
