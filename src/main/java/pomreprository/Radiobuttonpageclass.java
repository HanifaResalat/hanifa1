package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Radiobuttonpageclass extends Baseclass 
{
public Radiobuttonpageclass()
{
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[text()='radio buttons']")
private WebElement radiobuttonbox;

@FindBy(xpath="//input[@value=\"yes\"]")
private WebElement clickyes;

@FindBy(xpath="//input[@value=\"impressive\"]")
private WebElement clickimpressive;

@FindBy(xpath="//input[@value=\"no\"]")
private WebElement clickno;

@FindBy(xpath="//p[text()='Do you like the site?']")
private WebElement textpage;
@FindBy(xpath="(//label[@class=\"form-check-label\"])[1]")
private WebElement textyes;
@FindBy(xpath="(//label[@class=\"form-check-label\"])[2]")
private WebElement textimpressive;
@FindBy(xpath="(//label[@class=\"form-check-label\"])[3]")
private WebElement textno;

public void radiobuttonmethod()
{
	explicitwaitforclick(radiobuttonbox, 20);
	click(radiobuttonbox);
}

public void clickyesmethod()
{
	explicitwaitforclick(clickyes, 20);
	click(clickyes);
}
public void clickimpressivemethod()
{
	explicitwaitforclick(clickimpressive, 20);
	click(clickimpressive);
}
public void clicknomethod()
{
	explicitwaitforclick(clickno, 20);
	click(clickno);
}
public String textpagemethod()
{
	explicitwaitforclick(textpage, 20);
	return gettext(textpage);
}

public String textyesmethod()
{
	explicitwaitforclick(textyes, 20);
	return gettext(textyes);
}

public String textimpressivemethod()
{
	explicitwaitforclick(textimpressive, 20);
	return gettext(textimpressive);
}
public String textnomethod()
{
	explicitwaitforclick(textno, 20);
	return gettext(textno);
}





}
