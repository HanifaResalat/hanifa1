package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Alertpageclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;
import pomreprository.Widgetspageclass;

public class Widgettextclass extends Baseclass
{
	Practicecheckboxpageclass cb;
	Widgetspageclass wp;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		wp=new Widgetspageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		//wp.selectmethod();
		//wp.tabs();
		//wp.tooltips();
		wp.progress();
}
}