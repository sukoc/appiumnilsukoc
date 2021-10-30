package org.example.pagesAssert;

import com.thoughtworks.gauge.Step;
import org.example.StepImplementation;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class CategoryPage extends StepImplementation {

    @Step("Kategori Sayfası Kontrolü")
    public void category(){
        String textCheck = findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Kategoriler']")).getAttribute("content-desc");
        Assertions.assertEquals("Kategoriler",textCheck,"Kategori hatası");

    }
}
