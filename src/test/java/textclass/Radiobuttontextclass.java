package textclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;
import pomreprository.Practicecheckboxpageclass;
import pomreprository.Radiobuttonpageclass;

public class Radiobuttontextclass extends Baseclass
{
	Practicecheckboxpageclass cb;
	Radiobuttonpageclass rb;
	
	@BeforeClass
	public void launchurlmethods() 
	{
		String browser=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","browser");
		String url=fileutilitymethod("C:\\Users\\user\\eclipse-workspace\\practice_mavenproject\\Allfilefolder\\key_valueinput.properties","url");
		launchurl( browser, url);
		cb=new Practicecheckboxpageclass();
		rb=new Radiobuttonpageclass();
		
		
}
	@Test
	public void radiobuttons()
	
	{
		cb.practicemethod();
		cb.elementmethod();
		rb.radiobuttonmethod();
		rb.clickyesmethod();
		rb.clickimpressivemethod();
		rb.clicknomethod();
		System.out.println(rb.textpagemethod());
		System.out.println(rb.textyesmethod());
		System.out.println(rb.textimpressivemethod());
		System.out.println(rb.textnomethod());
	}
}