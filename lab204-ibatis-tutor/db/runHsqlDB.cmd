:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::: port check >>> netstat -ano | findstr 9001
::: port 변경 시 hsqlmanager.cmd, jdbc.properties localhost:port 도 변경해야 함
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
C:\eGovFrame-3.10.0\bin\jdk8u242-b08\bin\java.exe -cp ./hsqldb-2.3.2.jar org.hsqldb.Server -database.0 sampledb -dbname.0 sampledb -port 9001
