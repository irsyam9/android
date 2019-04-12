package com.intern.pages;

import com.intern.base.TestBase2;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Logout extends TestBase2 {

    public Logout(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")
    MobileElement btnLogout;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    MobileElement btnOk;

    public void tapLogoutBtn(){btnLogout.click();}
    public void tapOkBtn(){btnOk.click();}

}
