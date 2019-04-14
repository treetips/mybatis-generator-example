# mybatis-generator-example

Customize mybatis-generator and apply customized plugin example.

## Features

- Java v11
- Gradle v5.2
- MySQL v5.7
- mybatis-generator
- Intellij IDEA
- lombok

## Customize content

- tinyint(mysql) to Integer(java)
- smallint(mysql) to Integer(java)
- add lombok `@Data` annotation (remove default getter and setter) 
- add `implements Serializable`
- rename generate class name

## Usage

### Start mysql

```sh
# start mysql on docker
cd docker
docker-compose up -d
```

### Execute generate shell script

Build custom plugin and generate source codes.

```sh
cd mybatis-generator
./mybatis-generator.sh
```
