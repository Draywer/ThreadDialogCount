#### Домашнее задание к занятию 1.1 Многопоточное (параллельное) программирование. Работа с потоками
#### Задача 2. Межпоточный диалог со счетчиком

```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=55204:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\ThreadDialogCount\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.Main
pool-1-thread-1 стартовал...
pool-1-thread-3 стартовал...
pool-1-thread-2 стартовал...
pool-1-thread-3 сообщение № 0
pool-1-thread-2 сообщение № 0
pool-1-thread-1 сообщение № 0
pool-1-thread-2 сообщение № 1
pool-1-thread-3 сообщение № 1
pool-1-thread-1 сообщение № 1
pool-1-thread-2 сообщение № 2
pool-1-thread-1 сообщение № 2
pool-1-thread-3 сообщение № 2
pool-1-thread-2 сообщение № 3
pool-1-thread-2 завершил работу...
pool-1-thread-1 сообщение № 3
pool-1-thread-3 сообщение № 3
Количество сообщений: 4

Process finished with exit code 0
```