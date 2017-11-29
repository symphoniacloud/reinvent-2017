1. Build `lambda.jar` deployment package.

    $ mvn clean package

2. Note MD5 hash.

    $ md5 target/lambda.jar
    MD5 (target/lambda.jar) = a44849ba06def3df05171d720b8640b6

3. Re-run build, note different MD5 hash.

    $ mvn clean package
    ...
    $ md5 target/lambda.jar
    MD5 (target/lambda.jar) = 749b9bf5ff01b66515b3d2c3ddd92645

4. Uncomment 'reproducible-build-maven-plugin', run build

    $ mvn clean package

5. Note MD5 hash.

    $ md5 target/lambda.jar
    MD5 (target/lambda.jar) = 09c869b17fb4bae0d53895f92e48bf31

6. Re-run build, note *same* MD5 hash.

    $ mvn clean package
    ...
    $ md5 target/lambda.jar
    MD5 (target/lambda.jar) = 09c869b17fb4bae0d53895f92e48bf31
