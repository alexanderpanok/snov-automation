# snov-automation
Для работы необходимо установить Maven https://maven.apache.org/install.html и JDK 9 http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html

1) Открыть проект в IntelliJ IDEA
2) Выполнить команду mvn test в терминале IntelliJ IDEA
2.1) Для запуска тестов под Linux следует раскомментировать путь к драйеру System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); в BaseTest.java и закомментировать System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
3) Запустить нужный тест

Видеоинструкция для работы с Selenide http://ru.selenide.org/quick-start.html
В автотестах были использованы JUnit 4.11 и Selenide 4.8
