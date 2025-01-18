package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;

public class Frametextclass extends Baseclass
{
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
	}
	@Test
	public void framemethods()
	{
		cb.practicemethod();	
		fb.frameboxclick();
		fb.frameclick();
		fb.iframemethod();
		System.out.println(fb.frametexts());
		fb.parentframe();
		System.out.println(fb.parentframetexts());
	}	
}
