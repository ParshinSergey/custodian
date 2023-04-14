Project info:

* Ссылка на Докер: https://hub.docker.com/repository/docker/parshinsergey/custodian/general
* Запустить проект: docker run -p 8080:8080 parshinsergey/custodian:1.0.1

В Postman можно вызвать метод GET http://localhost:8080/api/request/balance
с телом JSON
{
    "header":
        {
        "requestType": "Balance",
        "requestID": "B530EEAD-9582-4728-80F8-A1F888AF87E2",
        "sourceAPPidentity": "1DD4EC32-45DB-404A-A123-6F657895E502",
        "endUserID": "70DA40D1-5944-4406-9827-30AA5E3ACD91"
        },
    "body":
        {
        "balance":{
            "account": "400820-UA40000001"
            }
        }
}

В корневой папке компьютера будет директория C:\testDirectory куда сохраняются сгенерированные файлы.

По пути custodian/src/main/java/dmt/custodian2016/ находятся сгенерированные из XML схемы классы.
