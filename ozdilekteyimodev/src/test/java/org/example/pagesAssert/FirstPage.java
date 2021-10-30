package org.example.pagesAssert;

import com.thoughtworks.gauge.Step;

import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class FirstPage extends StepImplementation {

    @Step("Açılış Sayfası Kontrolü")
    public void first() {
        String start = findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).getText();
        Assertions.assertEquals("ALIŞVERİŞE BAŞLA", start, "Hatalı buton");

    }
}
