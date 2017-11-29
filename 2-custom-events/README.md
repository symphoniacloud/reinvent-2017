1. Build `lambda.jar` deployment package.

    $ mvn clean package

2. Note size and number of classes

    $ du -hs target/lambda.jar
    664K	target/lambda.jar
    $ jar tf target/lambda.jar | grep -c '.*\.class$'
    282

3. Comment out 'aws-lambda-java-events', uncomment `KinesisEvent`, switch `System.out.println` statements, fix imports, rebuild

    $ mvn clean package

4. Note size and number of classes

    $ du -hs target/lambda.jar
    8.0K	target/lambda.jar
    $ jar tf target/lambda.jar | grep -c '.*\.class$'
    4
