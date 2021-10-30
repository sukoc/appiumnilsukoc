package org.example.pagesAssert;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ShopPage extends StepImplementation {

    @Step("Alışveriş Sayfası Doğrulama")
    public void shop(){
        String text = findElement(By.id("com.ozdilek.ozdilekteyim:id/relLayStore")).getAttribute("resource-id");
        Assertions.assertEquals("com.ozdilek.ozdilekteyim:id/relLayStore",text,"Alışveris sayfası hatası");

    }
}
