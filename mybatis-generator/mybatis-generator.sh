#!/bin/sh

# build mybatis-generator-plugin
 ../gradlew -b ../build.gradle clean :mybatis-generator:build
if [ $? -ne 0 ]; then
  echo "plugin build failure"
  exit 1
fi

# generate mybatis files
../gradlew -b ./mybatis-generator.gradle clean mbGenerator
if [ $? -ne 0 ]; then
  echo "generate entity failure"
  exit 1
fi

echo "generate success"
exit 0
