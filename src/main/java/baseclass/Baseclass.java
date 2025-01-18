package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationutility.Applicationutlity;
import dev.failsafe.internal.util.Durations;
import excelutility.Excelutility;
import fileutility.Fileutility;
import screenshotutility.Screenshotutility;
import waitutility.Waitutility;

public class Baseclass implements Fileutility,Applicationutlity,Excelutility,Screenshotutility,Waitutility
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
public void launchurl(String browser,String url) 
{
	
if(browser.equals("chrome")) 
{
	driver=new ChromeDriver();
	
}
else if(browser.equals("edge")) 
{
	driver=new EdgeDriver();
	
}
driver.get(url);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.xpath("(//button[@class=\"close\"])[1]")).click();
}
@Override
public String fileutilitymethod(String filepath, String key) {
	String value="";
	try {
		
	FileInputStream fis=new FileInputStream(new File(filepath));
	Properties prop= new Properties();
	prop.load(fis);
	value=prop.getProperty(key);
	}
	catch (Exception e)
	{
	System.out.println("Issue in Get Read data "+e);	
	}
	return value;
	
}
@Override
public void click(WebElement ele) {
	ele.click();
	
}
@Override
public void sendkeys(WebElement ele, String text) {
	ele.sendKeys(text);
	
}
@Override
public void frame(WebElement ele) {
	driver.switchTo().frame(ele);
	
}
@Override
public void frame(int index) {
	driver.switchTo().frame(index);
	
}
@Override
public void alertaccept() {
	driver.switchTo().alert().accept();
	
}
@Override
public void alertdismiss() {
	driver.switchTo().alert().dismiss();
}
@Override
public String alertgettext() {
return driver.switchTo().alert().getText();
	
}
@Override
public void alertsendkeys(String text) {
	driver.switchTo().alert().sendKeys(text);	
}
@Override
public String exceldata(String path, int sheetno, int row, int cell){
	String value="";
	try {
		
		
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(sheetno);
		value=sheet.getRow(row).getCell(cell).getStringCellValue();
	} catch (Exception e) {
		System.out.println("file not found"+e);
	}
	return value;
}
@Override
public void screenshot(WebDriver driver) {
	TakesScreenshot sc=(TakesScreenshot)driver;
	File src=sc.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot"+"/"+"screenshot1.png");
	try{
		FileUtils.copyFile(src, dest);
	}catch(Exception e) {
		System.out.println("file did not found");
	}
	
}
@Override
public void explicitwaitforclick(WebElement ele, int time) {
	wait=new WebDriverWait(driver,Duration.ofSeconds(time));
    wait.until(ExpectedConditions.elementToBeClickable(ele));
	
}
@Override
public void explicitwaitforvisbility(WebElement ele, int time) {
	wait=new WebDriverWait(driver,Duration.ofSeconds(time));
    wait.until(ExpectedConditions.elementToBeClickable(ele));
	
}
@Override
public String gettext(WebElement ele) {
	
   return ele.getText();
}
@Override
public boolean gettextdisplay(WebElement ele) {
	return ele.isDisplayed();
	
	// TODO Auto-generated method stub
	 
}
@Override
public boolean gettextenable(WebElement ele) {
	return ele.isEnabled();
}
@Override
public boolean gettexselected(WebElement ele) {
	return ele.isSelected();
}
@Override
public void parentframe1() {
	driver.switchTo().parentFrame();	
}
@Override
public void actiondoubleclick(WebElement ele) {
	Actions act=new Actions(driver);
	act.doubleClick(ele).build().perform();	
}
@Override
public void actioncontextclick(WebElement ele) {
	Actions act=new Actions(driver);
	act.contextClick(ele).build().perform();	
}
@Override
public void fileupload(WebElement ele,String folderpath) {
	ele.sendKeys(folderpath);
}
@Override
public String getcssvalue(WebElement ele) {
	
	return ele.getCssValue("color");
}

@Override
public void windowhandles() {
	String a=driver.getWindowHandle();
	Set<String> b= driver.getWindowHandles();
	for(String ele:b) 
	{
		System.out.println(ele);
		if(!ele.equals(a)) 
		{
			driver.switchTo().window(ele);
			break;
		}
	}
}

@Override
public void selectclassbyvisbletext(WebElement ele, String text) {
	Select sel=new Select(ele);
	sel.selectByVisibleText(text);
	
}
@Override
public void selectclassbyindex(WebElement ele, int index) {
	Select sel=new Select(ele);
	sel.selectByIndex(index);
}
@Override
public void selectclassbygetoptions(WebElement ele) {
	Select sel=new Select(ele);
	List<WebElement> opt=sel.getOptions();
	for(WebElement pq:opt)
	{
		System.out.println(pq.getText());
	}
}

}


