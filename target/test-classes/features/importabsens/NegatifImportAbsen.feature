Feature: Import Absen negative test

  Scenario: Pengguna tidak bisa melakukan upload file absen, kecuali format .xls atau .xlsx
    Given Pengguna sudah melakukan login dan pengguna berada di halaman import absen
    When Pengguna melakukan upload file absen dengan format pdf "<file>"
    And Pengguna melakukan klik button import
    Then Pengguna mendapatkan pesan gagal berupa popUp "<message>"

    Examples:
      | file                                                   | message                                         |
      | D:\\Project Selenium\\Data Absen\\Data Absen Hadir.pdf | *File harus berupa file Excel (.xls atau .xlsx) |
