Scala trait mockito bug
==============

UPDATE
This is a non-issue when using Scala 2.9.2 so if anyone is having problems with mocks on Scala 2.9.1 I highly recommend upgrading to 2.9.2

Project demonstrating a bug with mocking of SalatDAO.

Mockito doesn't work very well with Scala traits. There is a workaround by redefining the mixed-in methods and calling them from super again but that's not really elegant.