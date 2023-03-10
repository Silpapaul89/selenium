package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropNDrag extends BaseClass {

    public DropNDrag(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    WebElement ele1;

    @FindBy(id = "column-b")
    WebElement ele2;

    WebElement drag1 = driver.findElement(By.xpath("//header[text()='A']"));
    WebElement drag2 = driver.findElement(By.xpath("//header[text()='B']"));
    WebElement temp;

    public void DragAndDrop() {
        temp = drag1;
        drag1 = drag2;
        drag2 = temp;

        System.out.println(drag1);
        System.out.println(drag2);
        assertTitleIsDisplayed(drag1);
    }
}
