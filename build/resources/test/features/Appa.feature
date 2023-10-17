Feature: App Download
    As a user, I want to be able to download the app from the www.weareappa.com website,
    So that I can install and use the app on my device.

Scenario: User downloads the app from the index page

Given im on the index page of www.weareappa.com
When i click on the download-app button
Then I should be redirected to the specific route
