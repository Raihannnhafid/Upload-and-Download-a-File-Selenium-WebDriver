Feature: Import Absen

  Scenario: Pengguna bisa upload file absen dan datanya berhasil diimpor ke sistem
    Given Pengguna sudah melakukan login dan pengguna sudah dihalaman Import absen
    When Pengguna melakukan upload file absen "<file>"
    And Pengguna klik button import
    Then Pengguna mendapatkan pesan berupa popUp "<message>"

    Examples:
      | file                                                    | message               |
      | D:\\Project Selenium\\Data Absen\\Data Absen Hadir.xlsx | Berhasil import excel |
