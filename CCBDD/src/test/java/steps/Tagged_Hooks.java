package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {

	
	@Before(value = "@setCookies", order = 1)
	public void testBeforeHooks()
	{
		System.out.println("Scenario specific hooks - testBeforeHook executed!");
	}
	
	@After(value = "@setCookies", order = 1)
	public void testAfterHooks()
	{
		System.out.println("Scenario specific hooks - testAfterHook executed!");
	}
	
}
