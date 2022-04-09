package com.juaracoding.financeApp.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OutcomePage {

AndroidDriver<MobileElement> driver;
	
	public OutcomePage(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By btnAllow = By.xpath("//android.widget.Button[contains(@text, 'Allow')]");
	By btnTutup = By.id("android:id/button2");
	By btnAdd = By.id("com.chad.financialrecord:id/fabMenu");
	By txtAwal = By.id("com.chad.financialrecord:id/toolbarTitle");
	By btnDate = By.id("com.chad.financialrecord:id/tvDate");
	By date7Apr = By.xpath("//android.view.View[@content-desc='07 April 2022']");
	By btnOK = By.id("android:id/button1");
	By btnCategory = By.id("com.chad.financialrecord:id/spCategory");
//	By btnListCat = By.id("com.chad.financialrecord:id/tvName");
	By btnListCat = By.xpath("//android.widget.TextView[contains(@text, 'Kesehatan')]");
	By btnCalculator = By.id("com.chad.financialrecord:id/ibCalc");
	By btnTiga = By.id("com.chad.financialrecord:id/calc_btn_33");
	By btnNol = By.id("com.chad.financialrecord:id/calc_btn_24");
	By btnPlus = By.id("com.chad.financialrecord:id/calc_btn_add");
	By btnLima = By.id("com.chad.financialrecord:id/calc_btn_22");
	By btnTujuh = By.id("com.chad.financialrecord:id/calc_btn_11");
	By btnDua = By.id("com.chad.financialrecord:id/calc_btn_23");
	By btnEqual = By.id("com.chad.financialrecord:id/calc_btn_equal");
	By btnResult = By.id("com.chad.financialrecord:id/calc_btn_ok");
	By inputJumlah = By.id("com.chad.financialrecord:id/etAmount");
	By inputKet = By.id("com.chad.financialrecord:id/etNote");
	By btnSave = By.id("com.chad.financialrecord:id/btSave");
	By txtOutcome = By.id("com.chad.financialrecord:id/tvName");
	
	
	public void menuAwal() {
		tunggu(10);
		driver.findElement(btnAllow).click();
		tunggu(2);
		driver.findElement(btnTutup).click();
		tunggu(1);
		driver.findElement(btnAdd).click();
	}
	
	public String getAwal() {
		tunggu(2);
		return driver.findElement(txtAwal).getText();
	}
	
	public void menuOutcome(String ket) {
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
		tunggu(1);
		driver.findElement(btnCalculator).click();
		tunggu(2);
		driver.findElement(btnTiga).click();
		driver.findElement(btnLima).click();
		for(int i=1;i<=3;i++) {
			tunggu(1);
			driver.findElement(btnNol).click();
		}
		tunggu(1);
		driver.findElement(btnPlus).click();
		tunggu(1);
		driver.findElement(btnDua).click();
		tunggu(1);
		driver.findElement(btnTujuh).click();
		for(int i=1;i<=3;i++) {
			tunggu(1);
			driver.findElement(btnNol).click();
		}
		tunggu(1);
		driver.findElement(btnEqual).click();
		tunggu(1);
		driver.findElement(btnResult).click();
		tunggu(1);
		driver.findElement(inputKet).sendKeys(ket);
		tunggu(1);
		driver.findElement(btnSave).click();
	}
	
	public String getOutcome() {
		tunggu(2);
		return driver.findElement(txtOutcome).getText();
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
