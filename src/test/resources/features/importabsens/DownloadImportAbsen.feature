Feature: Download Absen

  Scenario: Pengguna bisa melakukan download template absen
    Given Pengguna melakukan login dan berada halaman Import absen
    Then Klik button Download template "<file>" berhasil terunduh di folder "<location>"

    Examples:
      | file                  | location                   |
      | DATA_ABSEN_HADIR.xlsx | C:\\Users\\User\\Downloads |
