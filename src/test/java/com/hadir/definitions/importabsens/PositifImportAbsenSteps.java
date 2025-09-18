package com.hadir.definitions.importabsens;

import org.testng.Assert;

import com.hadir.pages.ImportAbsenPage;
import com.hadir.utils.DriverUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PositifImportAbsenSteps {
    private ImportAbsenPage importAbsenPage;

    @Given("Pengguna sudah melakukan login dan pengguna sudah dihalaman Import absen")
    public void userIsOnImportPage(){
        importAbsenPage = new ImportAbsenPage(DriverUtil.getDriver());
        importAbsenPage.clickMenuImport();
        importAbsenPage.clickMenuImportAbsen();
    }

    @When("Pengguna melakukan upload file absen {string}")
    public void uploadFileAbsen(String filePath){
        importAbsenPage.uploadAbsen(filePath);
    }

    @And("Pengguna klik button import")
    public void clickButtonImport(){
        importAbsenPage.clickButtonImport();
    }

    @Then("Pengguna mendapatkan pesan berupa popUp {string}")
    public void getPopupMessage(String expectedMessage){
        String actualMessage = importAbsenPage.getPopupBerhasilImport();
        Assert.assertEquals(actualMessage, expectedMessage, "Popup tidak sesuai");
    }
}
