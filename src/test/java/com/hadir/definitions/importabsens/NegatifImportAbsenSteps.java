package com.hadir.definitions.importabsens;

import org.testng.Assert;

import com.hadir.pages.ImportAbsenPage;
import com.hadir.utils.DriverUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegatifImportAbsenSteps {
    private ImportAbsenPage importAbsenPage;

    @Given("Pengguna sudah melakukan login dan pengguna berada di halaman import absen")
    public void userIsOnImportAbsenPage(){
        importAbsenPage = new ImportAbsenPage(DriverUtil.getDriver());
        importAbsenPage.clickMenuImport();
        importAbsenPage.clickMenuImportAbsen();
    }

    @When("Pengguna melakukan upload file absen dengan format pdf {string}")
    public void uploadFileAbsen(String filePath){
        importAbsenPage.uploadAbsen(filePath);
    }

    @And("Pengguna melakukan klik button import")
    public void clickButtonImport(){
        importAbsenPage.clickButtonImport();
    }

    @Then("Pengguna mendapatkan pesan gagal berupa popUp {string}")
    public void getPopupGagalImport(String expectedMassage){
        String actualMassage = importAbsenPage.getPopupGagalImport();
        Assert.assertEquals(actualMassage, expectedMassage, "Popup tidak sesuai");
    }
    
}
