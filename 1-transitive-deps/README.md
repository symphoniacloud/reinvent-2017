1. Build `lambda.jar` deployment package.

    $ mvn clean package

2. Note size and number of classes

    $ du -hs target/lambda.jar
    4.0K	target/lambda.jar

    $ jar tf target/lambda.jar | grep -c '.*\.class$'
    1

3. Uncomment 'amazon-kinesis-client', rebuild.

    $ mvn clean package

4. Note size and number of classes

    $ du -hs target/lambda.jar
    12M	target/lambda.jar

    $ jar tf target/lambda.jar | grep -c '.*\.class$'
    7606
