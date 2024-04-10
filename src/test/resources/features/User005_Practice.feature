Feature: Practice
  @Practice
  Scenario: AZ01 istifadeci dogru bilgilerle giris edir
    Given istifadeci "brcURL" sehifesine girir
    And istifadeci 2 saniye lengiyir
    When istifadeci login yazisina basir
    And istifadeci 2 saniye lengiyir
    Then istifadeci etibarsiz login girir
    And istifadeci 2 saniye lengiyir
    And istifadeci etibarsiz password girir
    And istifadeci 2 saniye lengiyir
    And login button'una basir
    And istifadeci 2 saniye lengiyir
    And sehifeye giris edilmediyini test edir
    And sehifeden cixar
