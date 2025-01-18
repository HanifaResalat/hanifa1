package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Practicecheckboxpageclass;

public class Practicecheckboxpagetextclass extends Baseclass
{
	Practicecheckboxpageclass cb;
@BeforeClass
public void launchurlmethods() 
{
	String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
	String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
	launchurl( browser, url);
	cb=new Practicecheckboxpageclass();
}
@Test
public void checkboxmethods() 
{
	
	cb.practicemethod();
	cb.elementmethod();
	cb.checkboxmethod();
	cb.iframemethod();
	cb.clickcheckboxmethod();
	
	System.out.println(cb.checkboxvisibilitymethod());
	System.out.println(cb.checkboxdisplayymethod());
}
}
