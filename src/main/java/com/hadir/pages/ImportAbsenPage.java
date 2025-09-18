package com.hadir.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class ImportAbsenPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//p[normalize-space()='Import']")
    private WebElement menuImport;

    @FindBy(xpath = "//p[normalize-space()='Import Absen']")
    private WebElement menuImportAbsen;

    @FindBy(id = "selfie")
    public WebElement clickUploadFileAbsen;

    @FindBy(xpath = "//button[normalize-space()='Import']")
    public WebElement clickButtonImport;

    @FindBy(xpath = "//div[normalize-space()='Berhasil import excel']")
    public WebElement popUpBerhasilImport;

    @FindBy(xpath = "//div[normalize-space()='*File harus berupa file Excel (.xls atau .xlsx)']")
    public WebElement popUpGagalImport;

    @FindBy(xpath = "//button[normalize-space()='Download Template']")
    public WebElement buttonDownloadTemplate;

    public ImportAbsenPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickMenuImport() {
        wait.until(ExpectedConditions.elementToBeClickable(menuImport)).click();
    }

    public void clickMenuImportAbsen() {
        wait.until(ExpectedConditions.elementToBeClickable(menuImportAbsen)).click();
    }

    public void uploadAbsen(String fileAbsen) {
        wait.until(ExpectedConditions.visibilityOf(clickUploadFileAbsen)).sendKeys(fileAbsen);
    }

    public void clickButtonImport() {
        wait.until(ExpectedConditions.elementToBeClickable(clickButtonImport)).click();
    }

    public String getPopupBerhasilImport() {
        WebElement popUp = wait.until(ExpectedConditions.visibilityOf(popUpBerhasilImport));
        return popUp.getText();
    }

    public String getPopupGagalImport() {
        WebElement popUp = wait.until(ExpectedConditions.visibilityOf(popUpGagalImport));
        return popUp.getText();
    }

    public void downloadTemplate(String downloadDir, String fileName) throws Exception {
        // klik tombol download
        wait.until(ExpectedConditions.elementToBeClickable(buttonDownloadTemplate)).click();

        Thread.sleep(1000);

        // Tunggu proses download (misalnya 5 detik)
        Thread.sleep(5000);

        // Cek file
        File downloadedFile = new File(downloadDir + File.separator + fileName);
        if (downloadedFile.exists()) {
            System.out.println("File berhasil diunduh: " + downloadedFile.getAbsolutePath());
        } else {
            System.out.println("File tidak ditemukan di: " + downloadedFile.getAbsolutePath());
        }

    }

}