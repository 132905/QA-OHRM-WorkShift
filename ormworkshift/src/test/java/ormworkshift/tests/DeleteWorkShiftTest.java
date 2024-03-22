package ormworkshift.tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class DeleteWorkShiftTest extends BaseTest {
	
	@Test
	public void testDeleteWorkShift() throws InterruptedException {
		loginPage.doLogin("Admin", "admin123");

		loginPage.clickAdminButton();
		Thread.sleep(2000);
		adminPage.deleteWorkShift("ABCD");
		
		
		
		
		
		
		
		
		
		
		
		 
//		try {
			
//			}catch(NoSuchElementException e) {
//				adminPage.addWorkShift("ABCD","2:00 pm", "2:15 pm");
//				adminPage.deleteWorkShift("ABCD");
//			}
	}

}
