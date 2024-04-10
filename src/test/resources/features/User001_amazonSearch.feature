Feature: Amazon SearchBox Testi

  Scenario: AZ01 istifadeci searchbox'u test edir
    Given istifadeci amazon sehifesine gedir
    When istifadeci iphone axtarisi edir
    Then istifadeci necilerin iphone icerdiyini test edir
    And istifadeci sehifeni baglayir


  Scenario: AZ02 istifadeci searchbox'u test edir
    Given istifadeci amazon sehifesine gedir
    When istifadeci Selenium axtarisi edir
    Then istifadeci necilerin Selenium icerdiyini test edir
    And istifadeci sehifeni baglayir

  Scenario: AZ03 istifadeci searchbox'u test edir
    Given istifadeci amazon sehifesine gedir
    When istifadeci Java axtarisi edir
    Then istifadeci necilerin Java icerdiyini test edir
    And istifadeci sehifeni baglayir