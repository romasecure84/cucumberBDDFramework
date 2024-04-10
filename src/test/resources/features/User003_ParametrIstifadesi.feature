Feature: Parametr Istifadesi

  Background: Ortaq addimlar
    Given istifadeci amazon sehifesine gedir

@Ssenari1
  Scenario: AZ01 istifadeci searchbox'u test edir
    When istifadeci "iphone" axtarisi edir
    Then istifadeci necilerin "iphone" icerdiyini test edir


  Scenario: AZ02 istifadeci searchbox'u test edir
    When istifadeci "Selenium" axtarisi edir
    Then istifadeci necilerin "Selenium" icerdiyini test edir

  Scenario: AZ03 istifadeci searchbox'u test edir
    When istifadeci "Java" axtarisi edir
    Then istifadeci necilerin "Java" icerdiyini test edir
    And istifadeci sehifeni baglayir