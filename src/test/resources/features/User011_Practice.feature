Feature: ClassWork

  Scenario Outline: AZ01 istifadeci sutun basliqlarini list seklinde yazdirir
    Given istifadeci "guruURL" ana sehifesine gedir
    And "<Basliqlar>" sutunundaki butun deyerleri yazdirir
    Examples:
      | Basliqlar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: istifadeci sehifeni baglayir
      Given istifadeci sehifeni baglayir