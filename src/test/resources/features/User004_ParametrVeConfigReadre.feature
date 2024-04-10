Feature: Parametr ve configreader istifadesi
@ConfigReader
  Scenario: AZ01 Parametr istifadesinde ConfigReader Istifadesi
    Given istifadeci "faceURL" sehifesine gedir
    Then istifadeci 2 saniye lengiyir
    When urlin "facebook" icerdiyini test edir
    And sehifeni baglayir

  Scenario: AZ02 Parametr istifadesinde ConfigReader Istifadesi
  Given istifadeci "turboURL" sehifesine gedir
  Then istifadeci 2 saniye lengiyir
  When urlin "turbo" icerdiyini test edir
  And sehifeni baglayir

  Scenario: AZ03 Parametr istifadesinde ConfigReader Istifadesi
    Given istifadeci "amazonURL" sehifesine gedir
    Then istifadeci 2 saniye lengiyir
    When urlin "amazon" icerdiyini test edir
    And sehifeni baglayir