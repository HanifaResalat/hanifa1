package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Practicecheckboxpageclass;
import pomreprository.Radiobuttonpageclass;
import pomreprository.Uploadfolderpageclass;
import pomreprository.Webtablespageclass;

public class Webtablestextclass extends Baseclass
{
	
	Webtablespageclass wt;
	
	Practicecheckboxpageclass cb;
	
	
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		wt=new Webtablespageclass();
}
	@Test
	public void webtablemethod()
{
		cb.practicemethod();
		cb.elementmethod();
		wt.webtableboxmethod();
	wt.iframemethod();
	wt.namemethod();
	wt.emailmethod();
	wt.savetmethod();
	wt.gettextmethod();
	
	
}
}