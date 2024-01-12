package inheritancedemo;

public class SeleniumDemo {
	public static void main(String[] args) {
		Browser browser = new MozillaBrowser();
		browser.openUrl();
		browser.click();
		
		// Webdriver driver = new Chromedriver();
	}
}

//  abstract and final together
// abstract class - no object (only extends)
// final class - no extends  (only object)

// abstract class - no object creation allowed
// partial abstraction = abstract + concrete

// 99%
abstract class Browser{
	public abstract void openUrl();
	public abstract void click();
	
	public void getText() {
		System.out.println("asdfdsf");
	}
}


interface AndroidBrowser{
	public void openUrl();
	public void click();
}
interface IOSBrowser{
	public void openUrl();
	public void click();
	public void tap();
}

class ChromeBrowser implements AndroidBrowser, IOSBrowser{
	public void openUrl() {
		System.out.println("chrome open url");
	}
	public void click() {
		System.out.println("chrome- click");
	}
	public void tap() {
		
	}
}

class MozillaBrowser  extends Browser{
	public void openUrl() {
		System.out.println("chrome open url");
	}

	public void click() {
		System.out.println("chrome- click");
	}
}

