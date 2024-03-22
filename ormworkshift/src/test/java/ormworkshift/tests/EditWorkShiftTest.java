package ormworkshift.tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class EditWorkShiftTest extends BaseTest {
	
	@Test
	public void testEditWorkShift() throws InterruptedException {
		loginPage.doLogin("Admin", "admin123");

		loginPage.clickAdminButton();
		Thread.sleep(1000);
		adminPage.editWrkShift("General");
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//	editWrkShift(String oldWrkShiftName, String newWrkShiftName, String newWrkShiftFrmHrs, String newWrkShiftToHrs)	
		
//		}catch(NoSuchElementException e) {
//			adminPage.addWorkShift("11111","9:00 pm", "11:00 pm");
//			adminPage.editWrkShift("11111","ABCD","1:00 pm","1:45 pm");
//		}
	
	}
}
