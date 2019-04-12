package com.intern.testcases;

import com.intern.base.TestBase2;
import com.intern.pages.CarouselPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFeed extends TestBase2 {
    private CarouselPage carouselpage;

    public TestFeed(){super();}

    @BeforeMethod
    public void setup() throws IOException, InterruptedException{
        initialization();
        carouselpage = new CarouselPage();
    }

    @AfterMethod
    public void tearDown(){driver.quit();}

    @Test
    public void TcFeed() throws InterruptedException{
        carouselpage.tapNextBtn();
        carouselpage.tapNextBtn();
        carouselpage.tapStartBtn();
    }
}
