package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Buttonpageclass;
import pomreprository.Dynamicpropertiespageclass;
import pomreprository.Framepageclass;
import pomreprository.Practicecheckboxpageclass;

public class Dynamicpropertiestextclass extends Baseclass
{
	Practicecheckboxpageclass cb;
	Dynamicpropertiespageclass dp;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		dp=new Dynamicpropertiespageclass();
}
	@Test
	public void launchmethod() 
	{
		cb.practicemethod();
		cb.elementmethod();
		dp.dynamicboxmethods();
		System.out.println(dp.enablemethod());
		System.out.println(dp.enablemethod1());
		System.out.println(dp.colorchangemethod());
		System.out.println(dp.enablemethod2());
}
}