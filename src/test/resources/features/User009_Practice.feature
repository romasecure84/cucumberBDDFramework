Feature: herokuapp Delete Testi

  Scenario: AZ01 herokuapp adresinden delete button'u islemeli
    Given Istifadeci "herokuappURL" sehifesinde
    And add element buttonu'na basir
    And istifadeci 3 sn gozleyir
    Then Delete button'unun gorunene qeder gozleyit
    And Delete button'unun gorunduyunu test edir
    Then Delete button'una basir
    And Delete button'unun gorunmediyini test edir
    And sehifeni qapadir