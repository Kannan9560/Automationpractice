package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePagetest {

		Homepage hp;
		Base bp;
		
		public HomePagetest() {
			hp=new Homepage();
			bp=new Base();
		}
			@Test
			public void verifyWomenTag() {
				Assert.assertTrue(bp.elementFound(hp.getWomenTag()), "Failed");
				}
			@Test
			public void verifyWomen() {
				hp.getWomenTag().click();
				String women=bp.driver.getTitle();
			Assert.assertTrue(women.contains("Women"), "Failed");
			}
			@Test
			public void verifyDresses() {
				hp.getdressesTag().click();
				Assert.assertTrue(hp.getdressesTag().isDisplayed());

			}
			@Test
			public void size() {
				Assert.assertTrue(hp.getsize().isDisplayed());
			}
	}