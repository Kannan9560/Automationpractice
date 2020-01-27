package myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Base{
	
	@FindBy (xpath="//a[@title='Women']")
	private WebElement womenTag;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomenTag() {
		return womenTag;
	}
	@FindBy (xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement dressestag;
	
	public WebElement getdressesTag() {
		return dressestag;}
	
	@FindBy (xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement size;
	
	public WebElement getsize() {
	return size;
	}	
}