package TestPckg;

import org.testng.annotations.Test;

import BasePckg.Base;

public class Logintest extends Base {
		
		@Test(priority = 1)
		public void loginvalidation()
		{
			loginobj.loginmethod("Admin", "admin123");
			
		}
		
}
