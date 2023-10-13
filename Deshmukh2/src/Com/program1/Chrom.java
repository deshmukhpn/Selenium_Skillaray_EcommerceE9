package Com.program1;

import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Chrom {

	public static void main(String[] args) 
	{
		
	String Key="webdriver.chrome driver";
	String Value= ".\\chromedriver.exe";
	System.setProperty(Key,Value);
	WebDriverDecorator driver=new ChromeDrive();
	
		
	}

}