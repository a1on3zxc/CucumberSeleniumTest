package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }

    public void clickButtonEnter() {
        $(By.id("loginBtn")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }
}
