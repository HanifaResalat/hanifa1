package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseclass.Baseclass;

public class Widgetspageclass extends Baseclass
{
public Widgetspageclass() 
{
PageFactory.initElements(driver,this);	
}
@FindBy(xpath="//button[@data-target=\"#widget\"]")
private WebElement widgetbox;
@FindBy(xpath="//a[text()='select menu']")
private WebElement selectmenu;
@FindBy(xpath="(//select[@class=\"form-control\"])[2]")
private WebElement selectvalue;
@FindBy(xpath="(//select[@class=\"form-control\"])[3]")
private WebElement selectone;
@FindBy(xpath="(//select[@multiple=\"multiple\"])[2]")
private WebElement multiselect;


//tabs box locator

@FindBy(xpath="//button[@data-target=\"#widget\"]")
private WebElement widgetclick;
@FindBy(xpath="//a[text()='tabs']")
private WebElement tab;
@FindBy(xpath="//a[@id=\"home-tab\"]")
private WebElement tab1;
@FindBy(xpath="//p[contains(text(),'Message testing is the')]")
private WebElement tab1text;
@FindBy(xpath="//a[@id=\"profile-tab\"]")
private WebElement tab2;
@FindBy(xpath="//a[@id=\"contact-tab\"]")
private WebElement tab3;


//tooltips box locator

@FindBy(xpath="//a[text()='tool tips']")
private WebElement tooltipsboxclick;
@FindBy(xpath="//button[@title=\"you hovered over the button\"]")
private WebElement seeclick;
@FindBy(xpath="//input[@title=\"you hovered over the input\"]")
private WebElement sendinput;
@FindBy(xpath="//p[contains(text(),' What is tooltip content?')]")
private WebElement text;

//progreess box locator

@FindBy(xpath="//a[text()='progress bar']")
private WebElement progressboxclick;
@FindBy(xpath="//button[@id=\"resetButton\"]")
private WebElement startclick;
@FindBy(xpath="//div[text()='100%']")
private WebElement progressbar;

public void selectmethod() 
{
	explicitwaitforclick(widgetbox, 20);
	click(widgetbox);
	explicitwaitforclick(selectmenu, 20);
	click(selectmenu);
	
	//selectclassbyvisbletext(selectvalue,"Group 1, Option 1");
    selectclassbyindex(selectvalue,2);
	//selectclassbyvisbletext(selectone,"PHP");
	selectclassbyindex(selectone,1);
	selectclassbygetoptions(selectone);
	selectclassbygetoptions(multiselect);
}

public void tabs() 
{
	explicitwaitforclick(widgetbox, 20);
	click(widgetbox);
	explicitwaitforclick(tab, 20);
	click(tab);
	explicitwaitforclick(tab1, 20);
	click(tab1);
	System.out.println(gettext(tab1text));
	explicitwaitforclick(tab2, 20);
	click(tab2);
	explicitwaitforclick(tab3, 20);
	click(tab3);
}
public void tooltips() 
{
	explicitwaitforclick(widgetbox, 20);
	click(widgetbox);
	explicitwaitforclick(tooltipsboxclick, 20);
	click(tooltipsboxclick);
	explicitwaitforclick(seeclick, 20);
	click(seeclick);
	explicitwaitforclick(sendinput, 20);
	sendkeys(sendinput,"hanifa");
	explicitwaitforclick(text, 20);
	System.out.println(gettext(text));
}
public void progress() 
{
	explicitwaitforclick(widgetbox, 20);
	click(widgetbox);
	explicitwaitforclick(progressboxclick, 20);
	click(progressboxclick);
	explicitwaitforclick(startclick, 20);
	click(startclick);
	explicitwaitforclick(progressbar, 20);
	System.out.println(gettext(progressbar));
}
}
