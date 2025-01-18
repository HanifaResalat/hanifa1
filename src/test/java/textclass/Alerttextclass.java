package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Alertpageclass;
import pomreprository.Browserwindowspageclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;

public class Alerttextclass extends Baseclass
{
	Practicecheckboxpageclass cb;
	Framepageclass fg;
	Alertpageclass ap;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		fg=new Framepageclass();
		ap=new Alertpageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		fg.frameboxclick();
		ap.alertmethod();
}
}