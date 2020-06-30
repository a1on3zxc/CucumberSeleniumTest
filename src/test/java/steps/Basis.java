package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Basis {

    @Before
    public void openUrl() {
        open("https://dota2.ru/");
    }
}