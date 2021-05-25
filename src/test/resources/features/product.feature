

Feature: Aplle Products

  Scenario: iPad Navigation
    Given the user is on the home page
    When the user navigate to "ipad" "iPad Pro"
    Then the subtitle should be "iPad Pro"


  Scenario: Mac Navigation
    Given the user is on the home page
    When the user navigate to "mac" "MacBook Air"
    Then the subtitle should be "MacBook Air"

  @wip
  Scenario Outline: Products Navigation
    Given the user is on the home page
    When the user navigate to "<tab>" "<module>"
    Then the subtitle should be "<module>"
    Examples:
      | tab    | module    |
      | iphone | iPhone 11 |
      | watch  | Compare   |
      | tv     | AirPlay   |
