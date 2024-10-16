## Spring-Bootcamp

The purpose of this repository was to train a programmer on Spring framework. The pre-requisite of Spring 
is Java programming language. This repository is designed to cover the fundamentals of Java to speed-up the 
user to learn Spring efficiently. Another purpose of the `bootcamp` is to find a methodology to learn a new programming language. This will allow
user to fathom, understand and start coding in a particular program. Overall, the goal of the repository is to give
an overview of Java and training exercises to learn Spring framework for web-development.

## Contents

- [x] Short History of Java
- [x] Java Compiler(Basics)
- [x] Reserved Names/ Keywords
- [x] Java versions(timeline)
- [x] Java Data Types
- [x] Methods
- [] Arrays && Strings
- [] Class and Objects
- [] Enum and Interface Class
- [] Constructor
- [] getter and setter
- [] Regular Expression
- [] Exception Handling
- [] The big four(encapsulation...)
- [] Super class vs this class
- [] Javadoc
- [] Switch statements
- [] Virtual threads
- [] Generics and Collections
- [] Modules


## Short History of Java

Java programming language came into existence through the work of James Gosling in 1994. He was working at Sun 
Microsystems at the time. 

## Java Compiler & JVM

Compiler is a program that translates source code (high-level language) into machine code, bytecode or another 
programming language. 

JVM is the java virtual machine which allows any machine to run java bytecode. Bytecode are instructions 
which dictates the VM of how to process the code into machine code. JVM has two purposes: 1. To run java code on 
any machine. 2. To optimize program memory.

`.java` file is the code file. `.class` file is the compiled file.

NOTE: javac expects a FILENAME(sum.java) while java expects a CLASSNAME(sum). 

`javac herb.java` //javac means java compiler.

`java herb`

OUTPUT == WEED IS LIFE!!

Compiler checks the syntax of the source code and compiles it into bytecode.
JVM Loads the bytecode and executes it. This gives us the output.

Q. How do you run source code in a package through cmd?

A. Once the java.class file is created in the subpackage folder. Then move to the source root level and
then run the run command with dir path to the class file. For instance: `java subpackage/classname.class`

## Names and Reserved Names and Keywords

- abstract
- assert
- boolean
- break
- byte
- case
- catch
- char
- class
- const
- continue
- default
- do
- double
- else
- extends
- false
- final
- finally
- float
- for
- goto
- if
- implements
- import
- instanceof
- int
- interface
- long
- native
- new
- null
- package
- private
- protected
- public
- return
- short
- static
- strictfp
- super
- switch


## Java Versions
Currently, I am using `Java 21`.

## Java Data Types
A type is a set of values and operations on them. A type is either a primitive or reference type.

Boolean (true and false)
byte (8-bit): 128
short (16 bit): 32767
int (32 bit): 1237120931023701
long (64-bit): ....
float (32-bit): ....
double (64-bit): ...
char (16-bit): This contains the ASCII (American Standard Code for Information Interchange) characters. This starts
               with ''.

There are two data types: primitive types and reference types.

Primitive types are NOT objects and are directly stored in the 
memory. 

Variables are values that store data. There are three types
of variables:

- Local Variable: Declared inside a method.
- Instance Variable: Outside of method.
- Static Variable: Outside of method.


## Methods

Methods are functions which dictate the behaviour of the class.

Method Anatomy:

[Access Modifier] [Other Modifiers] [return type] [Method Name] (parameter-list) 

Access Modifier: access modifiers are used to define the visibility and accessibility of methods.
These are the following types:

- public: access from any class or package. 
- private: access only from the class. 
- protected: access through same package or sub-classes. 
- default(no modifier): access only through the same package.

Modifier	Same Class	Same Package	Subclass (Same/Different Package)	Any Class (Any Package)
public	      Yes	         Yes	                Yes	                          Yes
private	      Yes	          No	                 No	                           No
protected	  Yes	         Yes	                Yes	                           No
default	      Yes	         Yes	                 No	                           No


Other Modifiers: These add extra layer of accessibilty of the classes, methods and fields
These are the following:

static: Used for class-level variables and methods.
final: Used to define constants, prevent inheritance, and prevent method overriding.
abstract: Used to define abstract classes and methods that must be implemented in subclasses.
synchronized: Used to make methods or blocks of code thread-safe in concurrent programming.
native: Used to declare methods implemented in a language other than Java (typically C or C++).



## Class and Objects

OOP (Object-Oriented Programming) is the heart of Java. 

What is a class? 
## References

These are helpful sites in relation to the study and research on Java:

- [google-java-guide](https://google.github.io/styleguide/javaguide.html)
- [spring-monolinth](https://spring.io/blog/2022/10/21/introducing-spring-modulith)
- [Java-21-overview](https://horstmann.com/unblog/2023-09-19/index.html)
- [1BRC-Java](https://questdb.io/blog/1brc-merykittys-magic-swar/)
- [kill-1](https://stackoverflow.com/questions/77485058/will-sending-kill-11-to-java-process-raises-a-nullpointerexception)
- [React-Context](https://legacy.reactjs.org/docs/context.html)
- [Java-StringArr](https://www.digitalocean.com/community/tutorials/java-string-array-to-string)
- [Java-Library-Software-Engineer](https://www.linkedin.com/jobs/view/3145627369/?refId=cfb6dc0e-55d8-42ee-b2dc-9a7d4946fc9f&trackingId=wp71rJlISd%2BYn8PZlONt7Q%3D%3D)
- [OOP-Giant-Book](https://www.javier8a.com/itc/bd1/articulo.pdf)
