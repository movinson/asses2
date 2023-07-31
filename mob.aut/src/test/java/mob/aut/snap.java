package mob.aut;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class snap {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		//Using SnapDeal application for this assignment
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "vivo 1818");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("appPackage", "com.snapdeal.main");
		caps.setCapability("appActivity", "com.snapdeal.ui.material.activity.MaterialMainActivity");
		URL url = new URL(" http://localhost:4723");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, caps);

		// Select language and click continue
		MobileElement languageButton = driver.findElement(By.id("com.snapdeal.main:id/tv_language"));
		languageButton.click();

		MobileElement selectLanguage = driver.findElement(By.xpath("//android.widget.TextView[@text='English']"));
		selectLanguage.click();

		MobileElement continueButton = driver.findElement(By.id("com.snapdeal.main:id/btn_continue"));
		continueButton.click();

		MobileElement product = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Product image']"));
		product.click();

		MobileElement addToCartButton = driver.findElement(By.id("com.snapdeal.main:id/btn_add_cart"));
		addToCartButton.click();

		MobileElement cartButton = driver.findElement(By.id("com.snapdeal.main:id/cart_icon"));
		cartButton.click();

		MobileElement checkoutButton = driver.findElement(By.id("com.snapdeal.main:id/btn_checkout"));
		checkoutButton.click();

		MobileElement paymentButton = driver.findElement(By.id("com.snapdeal.main:id/btn_pay_securely"));
		paymentButton.click();


		driver.closeApp();

	}
}
