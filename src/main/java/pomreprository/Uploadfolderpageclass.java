package pomreprository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Baseclass;

public class Uploadfolderpageclass extends Baseclass
{
public 	Uploadfolderpageclass() 
{
PageFactory.initElements(driver,this);	
}
@FindBy(xpath="//a[text()='upload and download']")
private WebElement uploadfilebox;

@FindBy(xpath="//input[@class=\"form-control-file\"]")
private WebElement uploadfilefolder;

public void uploadfileboxmethod() 
{
	explicitwaitforclick(uploadfilebox, 20);
	click(uploadfilebox);
}
public void uploadfilefoldermethod() 
{
	fileupload(uploadfilefolder,"C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\New folder");
}
}
