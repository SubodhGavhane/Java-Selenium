package GenericLib;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkingLib {

	public  int randomMethod() {

		Random rm=new Random();
		int RNO = rm.nextInt();
	
		return RNO;
	}

	public void selectByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibleText);
		
	}
	
	
	
}
