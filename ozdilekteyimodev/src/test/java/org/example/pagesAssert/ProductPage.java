package org.example.pagesAssert;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class ProductPage extends StepImplementation {

    @Step("Product sayfası görüntüleme")
    public void product(){
        boolean product = findElement(By.id("com.ozdilek.ozdilekteyim:id/imgCart")).isDisplayed();
        Assertions.assertTrue(product,"Product sayfası hatalı");

    }
}
