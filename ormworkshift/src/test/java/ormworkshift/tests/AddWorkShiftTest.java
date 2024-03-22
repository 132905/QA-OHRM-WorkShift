package ormworkshift.tests;

import org.testng.annotations.Test;

public class AddWorkShiftTest extends BaseTest {
	
	@Test
	public void testAddWorkShift() throws InterruptedException {
		loginPage.doLogin("Admin", "admin123");

		loginPage.clickAdminButton();
		Thread.sleep(2000);

		adminPage.addWorkShift();
	}


}
