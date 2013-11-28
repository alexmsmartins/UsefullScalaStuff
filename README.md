A few tools that I find useful when programming in Scala.

Namely:

 - a mapcar like implementation 
 - a loggerWrapper trait for SLF4J where every method where it makes sense returns a parameterized type T instead of Unit.


The loggerWrapper makes it easy to turn something like:

    methodOne(methodTwo(2, 3), "String")

into

    methodOne(debug("MethodTwo returns {}.", methodTwo(2, 3)), "String")


The build state of UsefullScalaStuff is [![Build Status](https://travis-ci.org/alexmsmartins/UsefullScalaStuff.png?branch=master)](https://travis-ci.org/alexmsmartins/UsefullScalaStuff)

