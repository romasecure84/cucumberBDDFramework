Feature: Scenario outline practice
  Scenario Outline: AZ01 ConfigReader ile Scenario Outline istifadesi
    Given istifadeci "<istenilenURL>" sehifesine gedir
    Then istifadeci 2 saniye lengiyir
    When istifadeci "<axtarilanURL>" dogrulugunu test edir
    And istifadeci sehifeni baglayir
    Examples:
      | istenilenURL | axtarilanURL |
      | amazonURL    | amazon       |
      | faceURL      | facebook     |
      | turboURL     | turbo        |
      | brcURL       | blue         |

