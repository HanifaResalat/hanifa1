package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Browserwindowspageclass;
import pomreprository.Framepageclass;
import pomreprository.Modaldialogspageclass;
import pomreprository.Practicecheckboxpageclass;

public class Modaldialogetextclass extends Baseclass {
	Practicecheckboxpageclass cb;
	Framepageclass fb;
	Modaldialogspageclass md;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		fb=new Framepageclass();
	   md=new Modaldialogspageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		fb.frameboxclick();
		md.modalmethod();
}
}