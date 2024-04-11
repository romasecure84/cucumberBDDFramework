Feature: Datables saytinda 5 ferqli istifadeci girisi edin
  Scenario Outline: AZ01 istifadeci 5 ferqli qeyd girisi ede bilmelidir
    When istifadeci "dataURL" anasehifesine gedir
    Then istifadeci new button'una basir
    And ad bolumune "<firstname>" yazir
    And istifadeci 1 saniye lengiyir
    And soyad bolumune "<lastname>" yazir
    And istifadeci 1 saniye lengiyir
    And position bolumune "<position>" yazir
    And office bolumune "<office>" yazir
    And istifadeci 1 saniye lengiyir
    And extension bolumune "<extension>" yazir
    And startDate bolumune "<startDate>" yazir
    And salary bolumune "<salary>" yazir
    And istifadeci create button'una basir
    And istifadeci 1 saniye lengiyir
    And istifadeci "<firstname>" ile axtaris edir
    And ad bolumunde "<firstname>" oldugunu test edir
    Examples:
      | firstname | lastname | position | office | extension | startDate | salary |

    Scenario: istifadeci sehifeni baglayir
      Given istifadeci sehifeni baglayir