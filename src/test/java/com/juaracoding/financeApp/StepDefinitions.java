package com.juaracoding.financeApp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class StepDefinitions extends BaseTest {

	@Test(priority = 1, description = "User membuka catatan keuangan")
	public void testOpenApp() {
		logger = reports.startTest("Aplikasi Catatan Keuangan");
		outcomePage.menuAwal();
		tunggu(1);
		assertEquals(outcomePage.getAwal(), "Tambah Transaksi");
	}
	
	@Test(priority = 2, description = "User membuat catatan pengeluaran")
	public void testOutcome() {
		logger = reports.startTest("Membuat Catatan Pengeluaran");
		outcomePage.menuOutcome("Obat dan Periksa");
		tunggu(1);
		assertEquals(outcomePage.getOutcome(), "Kesehatan");
	}
	
	@Test(priority = 3, description = "User membuat catatan pemasukkan")
	public void testIncome() {
		logger = reports.startTest("Membuat Catatan Pemasukan");
		incomePage.menuIncome("100000", "Tarik Dana Ajaib");
		tunggu(1);
		assertEquals(incomePage.getIncome(), "Investasi");		
	}
	
}
