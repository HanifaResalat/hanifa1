package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Browserwindowspageclass;
import pomreprository.Buttonpageclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;

public class Browserwindowstextclass extends Baseclass
{
	Framepageclass fb;
	Browserwindowspageclass bw;
	Practicecheckboxpageclass cb;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		fb=new Framepageclass();
	    bw=new Browserwindowspageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		fb.frameboxclick();
		bw.browserwindowmethod();
		//bw.newtab();
	//bw.browserwindowmethod1();
bw.newwindowmessagemethod();
}
}