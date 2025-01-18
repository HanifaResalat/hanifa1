package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Alertpageclass extends Baseclass 
{
public Alertpageclass() 
{
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='alerts']")
private WebElement alertbox;

@FindBy(xpath="(//button[text()='Click me'])[1]")
private WebElement clickmealert;

@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[9]")
private WebElement buttonclickafter5sec;

@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
private WebElement confirmbox;
@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
private WebElement promptbox;

public void alertmethod() 
{
	explicitwaitforclick(alertbox, 20);
	click(alertbox);
	explicitwaitforclick(clickmealert, 20);
	click(clickmealert);
	alertaccept();
	explicitwaitforclick(buttonclickafter5sec, 20);
	click(buttonclickafter5sec);

	explicitwaitforclick(confirmbox, 20);
	click(confirmbox);
	alertdismiss();
	explicitwaitforclick(promptbox, 20);
	click(promptbox);
	alertsendkeys("hanifa");
	alertaccept();
	
}
}
