
<h1 >Проект автоматизации тестирования UI для сайта <a href="https://aeroflot.ru/ ">AEROFLOT </a> :airplane: </h1> 

![MainLogo.png](media/logo/MainLogo.png)
 
## :books: Содержание

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Отчеты в Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомления в Telegram с использованием бота</a>

* <a href="#video">Пример прогона теста в Selenoid</a>

<a id="tools"></a>
## :gear: Технологии и инструменты

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="media/logo/Intelij_IDEA.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="media/logo/GitHub.png" width="50"/></a>  
<a href="https://www.java.com/"><img alt="Java" height="50" src="media/logo/Java.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="media/logo/Gradle.svg" width="50"/></a>  
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="media/logo/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="media/logo/Selenide.png" width="50"/></a>
<a href="https://rest-assured.io/"><img alt="RestAssured" height="50" src="media/logo/RestAssured.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="media/logo/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure Report" height="50" src="media/logo/Allure_Report.svg" width="50"/></a>
<a href="https://qameta.io/"><img alt="Allure TestOps" height="50" src="media/logo/Allure_TO.svg" width="50"/></a>
<a href="https://www.atlassian.com/software/jira"><img alt="Jira" height="50" src="media/logo/Jira.svg" width="50"/></a>  
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="media/logo/Telegram.svg" width="50"/></a>
</div>

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки

- :small_blue_diamond: Проверка содержания главной страницы
- :small_blue_diamond: Названия разделов в хедере корректны при переключении языка
- :small_blue_diamond: Проверка содержания всплывающего окна "О компании"
- :small_blue_diamond: Параметризованный тест проверки локации в списке офисов
- :small_blue_diamond: Проверка результатов поиска
- :small_blue_diamond: Проверка содержания раздела "Проекты"

<a id="console"></a>
## :computer: Запуск тестов из терминала
### Локальный запуск тестов

```bash
./gradlew clean test -Denv=local
```

### Удаленный запуск тестов

```bash
./gradlew clean test -Denv=remote
"-Dbrowser=${BROWSER}" 
"-DbrowserVersion=${BROWSER_VERSION}" 
"-DbrowserSize=${BROWSER_SIZE}" 
"-DremoteUrl=${REMOTE_URL}"
"-DbaseUrl=${BASE_URL}"
```

`${BROWSER}` - наименование браузера (_по умолчанию - <code>chrome</code>_).

`${BROWSER_VERSION}` - версия браузера (_по умолчанию - <code>100.0</code>_).

`${BROWSER_SIZE}` - размер окна браузера (_по умолчанию - <code>1920x1080</code>_).

`${REMOTE_URL}` - адрес удаленного сервера, на котором будут запускаться тесты.

`${BASE_URL}` - адреc главной страницы тестируемого сайта.


<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/final_project_ui/)

<p align="center">
<a><img title="Jenkins Job" src="media/screenshots/JenkinsMain.png" alt="Jenkins"/></a>
</p>

<a target="_blank" href="https://jenkins.autotests.cloud/job/Students/job/final_project_ui_test/build ">Сборка с параметрами</a>
<p align="center">

<p align="center">
<a><img src="media/screenshots/JenkinsBuild.png" alt="Jenkins"/></a>
</p>

Из Jenkins возмжно перейти в Allure Report и Allure TestOps.

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/></a> Отчеты в [Allure Report](https://jenkins.autotests.cloud/job/final_project_ui/allure/)

### Главная страница

<p align="center">
<img title="Allure Overview Dashboard" src="media/screenshots/AllureMain.png">
</p>

### Тест-кейсы

К каждому тест-кейсу прикреплен скриншот страницы последнего шага, логи и видео.

<p align="center">
<img title="Allure Tests" src="media/screenshots/AllureSuites.png">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3649/dashboards)

Интеграция Allure TestOps с Jenkins позволяет следить за выполнением прогона и управлять запуском тест-кейсов.

### Главная страница

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TestOpsDashboard.png">
</p>


### Тест-кейсы

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TestOpsTestCases.png">
</p>


<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-883)

### Интеграция Jira и Allure TestOps
<p align="center">
<img title="Jira" src="media/screenshots/JiraScreen.png">
</p>


<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram с использованием бота

<p >
<img title="telegram bot" src="media/screenshots/TelegramScreen.png">
</p>