package applicationutility;

import java.util.Set;

import org.openqa.selenium.WebElement;

public interface Applicationutlity
{
public void click(WebElement ele);
public void sendkeys(WebElement ele,String text);
public String gettext(WebElement ele);
public boolean gettextdisplay(WebElement ele);
public boolean gettextenable(WebElement ele);
public boolean gettexselected(WebElement ele);
public void frame(WebElement ele);
public void frame(int index);
public void parentframe1();
public void alertaccept();
public void alertdismiss();
public String alertgettext();
public void alertsendkeys(String text);
public void actiondoubleclick(WebElement ele);
public void actioncontextclick(WebElement ele);
public void fileupload(WebElement ele,String folderpath);
public String getcssvalue(WebElement ele);
public void selectclassbyvisbletext(WebElement ele,String text);
public void selectclassbyindex(WebElement ele,int index);
public void selectclassbygetoptions(WebElement ele);
public void windowhandles();
}
