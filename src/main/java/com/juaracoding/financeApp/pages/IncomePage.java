package com.juaracoding.financeApp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class IncomePage {
	
AndroidDriver<MobileElement> driver;
	
	public IncomePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu");
	By btnIncome = By.id("com.chad.financialrecord:id/btnIncome");
	By btnDate = By.id("com.chad.financialrecord:id/tvDate");
	By date7Apr = By.xpath("//android.view.View[@content-desc='07 April 2022']");
	By btnOK = By.id("android:id/button1");
	By btnCategory = By.id("com.chad.financialrecord:id/spCategory");
	By btnListCat = By.xpath("//android.widget.TextView[contains(@text, 'Investasi')]");
	By inputJumlah = By.id("com.chad.financialrecord:id/etAmount");
	By inputKet = By.id("com.chad.financialrecord:id/etNote");
	By btnSave = By.id("com.chad.financialrecord:id/btSave");
	By txtIncome = By.id("com.chad.financialrecord:id/tvName");
	
	public void menuIncome(String jum, String ket) {
		tunggu(1);
		driver.findElement(btnAdd).click();
		tunggu(1);
		driver.findElement(btnIncome).click();
		tunggu(3);
		driver.findElement(btnDate).click();
		tunggu(3);
		driver.findElement(date7Apr).click();
		tunggu(2);
		driver.findElement(btnOK).click();
		tunggu(2);
		driver.findElement(btnCategory).click();
		tunggu(2);
		driver.findElement(btnListCat).click();
		tunggu(2);
		driver.findElement(inputJumlah).sendKeys(jum);
		tunggu(1);
		driver.findElement(inputKet).sendKeys(ket);
		tunggu(1);
		driver.findElement(btnSave).click();
	}
	
	public String getIncome() {
		tunggu(2);
		return driver.findElement(txtIncome).getText();
	}
	
	
	public void tunggu(int detik) {
		try {
			Thread.sleep(detik*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
