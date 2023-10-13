package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
@FindBy(xpath="//a[text()=' GEARS ']")

private WebElement gearsbtn;
@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
private WebElement skillrarydemoapp;
@FindBy(xpath="//input[@name='q']")
private WebElement searchTf;
@FindBy(xpath="//input[@value='go']")
private WebElement searchicon;
@FindBy(xpath="//a[@class='close_cookies']")
private WebElement coockies;
public SkillraryHomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void gearsButton() {
	gearsbtn.click();
	
}
public void skillrarydemoappWebElement() {
	skillrarydemoapp.click();
	
}
public void searchTextfield(String data) {
searchTf.sendKeys(data);

}
public void searchiconWebElement() {
	searchicon.click();
	
}

public void coockiesIcon() {
	coockies.click();
	
}











}
