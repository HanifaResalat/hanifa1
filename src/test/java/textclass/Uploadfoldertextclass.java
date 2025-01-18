package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Practicecheckboxpageclass;
import pomreprository.Radiobuttonpageclass;
import pomreprository.Uploadfolderpageclass;

public class Uploadfoldertextclass extends Baseclass
{
	Uploadfolderpageclass uf;
	Practicecheckboxpageclass cb;
	
	
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		
		uf=new Uploadfolderpageclass();
}
	@Test
	public void uploadfilemethod()
{
		cb.practicemethod();
		cb.elementmethod();
		uf.uploadfileboxmethod();
		uf.uploadfilefoldermethod();
		
}
	
}