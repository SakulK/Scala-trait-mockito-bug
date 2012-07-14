Scala trait mockito bug
==============

Project demonstrating a bug with mocking of SalatDAO.

Mockito doesn't work very well with Scala traits. There is a workaround by redefining the mixed-in methods and calling them from super again but that's not really elegant.