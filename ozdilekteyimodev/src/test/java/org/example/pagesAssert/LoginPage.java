package org.example.pagesAssert;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends StepImplementation {

    @Step("Login sayfası")
    public void login() {
        boolean loginButton = findElement(By.id("com.ozdilek.ozdilekteyim:id/btnLogin")).isDisplayed();
        Assertions.assertTrue(loginButton, "Login sayfası hatalı");

    }
}
