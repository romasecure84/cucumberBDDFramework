Feature: Ssenari outline istifadesi

  Scenario Outline: AZ01 istifadeci istediyi kelimeleri axtaris edir
    Given istifadeci amazon sehifesine gedir
    Then istifadeci "<istenilenKelime>" ucun axtaris edir
    Then neticelerin "<itenilenKelimeKontrol>" icerdiyini test edir
    And sehifeni baglayir
    Examples:
      | istenilenKelime | itenilenKelimeKontrol |
      | iphone          | iphone                |
      | selenium        | selenium              |
      | SQL             | SQL                   |