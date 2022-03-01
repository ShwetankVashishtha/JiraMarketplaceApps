package wrappers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author shwetankvashishtha
 *
 */
public class PageBase {

	/** The driver. */
	protected WebDriver driver = null;

	/**
	 * 
	 * @param driver
	 *            the driver
	 */

	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
