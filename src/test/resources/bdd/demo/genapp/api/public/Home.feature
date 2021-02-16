Feature: Testing REST API provided by the Home Controller
    User should be able to get the information about the application

    Scenario: Get Home->About details
        Given I set Home->About api endpoint
        When I do a GET request
        Then I receive a valid response

    Scenario: client makes call to GET /hello
        Given the client calls /hello
        When the client receives status code of 200
        Then the client receives server version hello