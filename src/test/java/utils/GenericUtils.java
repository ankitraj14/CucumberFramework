package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	//Getting window handle of child id
			public void SwitchWindowtoChild() {
					Set<String> handles = driver.getWindowHandles();
					Iterator<String> it = handles.iterator();
				    String parentId = it.next();
				    String childId = it.next();
				    driver.switchTo().window(childId);
			}

}
