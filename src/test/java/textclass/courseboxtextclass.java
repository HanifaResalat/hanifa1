package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.coursebox;

public class courseboxtextclass extends Baseclass
{coursebox cb;
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new coursebox();
}
	@Test
	public void methods() 
	{
		cb.coursemethod();
	}
}