@Estefi
Feature: Home Page

  Background:
    Given The user is placed in the practice page

  Scenario: Home Page with three Sliders only
    When Click on Shop Menu
    And Click on Home menu button
    Then Verifies that the home page contains only three sliders

  Scenario: Home Page with three Arrivals only
    When Click on Shop Menu
    And Click on Home menu button
    Then Verifies that the Home page contains only three Arrivals
