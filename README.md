***Plugin commands***
==
**Compile plugin class**

mkdir -p ./target/classes/META-INF | 
cp -avr ./src/main/resources/META-INF/services/ ./target/classes/META-INF |
javac -cp /usr/lib/jvm/openjdk-8u232-b09/lib/tools.jar ./src/main/java/JavacPlugin.java -d ./target/classes

**Compile with plugin switch**

javac -cp /usr/lib/jvm/openjdk-8u232-b09/lib/tools.jar:./target/classes -Xplugin:MyPlugin -d ./target/classes ./src/main/java/JavacPlugin.java
