package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Buttonpageclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;

public class Buttontextclass extends Baseclass
{
	Buttonpageclass bb;
	Framepageclass fb;
	Practicecheckboxpageclass cb;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		fb=new Framepageclass();
	    bb=new Buttonpageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		cb.elementmethod();
		bb.clickbuttonmethod();
		bb.doubleclickmethod();
		bb.contextclickmethod();
		bb.clickmethod();
	}
}