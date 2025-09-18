package com.hadir.definitions.importabsens;

import com.hadir.pages.ImportAbsenPage;
import com.hadir.utils.DriverUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DownloadAbsenSteps {

    private ImportAbsenPage importAbsenPage;

    @Given("Pengguna melakukan login dan berada halaman Import absen")
    public void userIsOnImportAbsenPage(){
        importAbsenPage = new ImportAbsenPage(DriverUtil.getDriver());
        importAbsenPage.clickMenuImport();
        importAbsenPage.clickMenuImportAbsen();
    }

    @Then("Klik button Download template {string} berhasil terunduh di folder {string}")
    public void clickDownloadTemplate(String filePath, String locationDirectory) throws Exception{
        importAbsenPage.downloadTemplate(filePath, locationDirectory);
    }

}
