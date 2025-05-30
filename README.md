## Contents

- [x] [What is Java?](#What-is-it)
- [x] [Short History of Java](#short-history-of-java)
- [x] [Java Compiler](#java-compiler)
- [x] [Reserved Names/ Keywords](#keywords)
- [x] [Java versions(timeline)](#java-versions)
- [x] [Java Data Types](#java-data-types)
- [x] [Methods](#methods)
- [] [Arrays && Strings](#array-and-strings)
- [] [Class and Objects](#objects)
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
- [x] [References](#references)

## What is it

Every programming language has distinguishing features which includes the paradigm, type discipline and 
memory management. Java is a `generic`, `Object-oriented` and `concurrent` language. Further, java is `static`, 
`strong`, and `safe` data type.

Here these terms are further explained:

- Generic: Allows to create a generic data types and provides type safety.
- OO: Everything in java is an object except the primitive data types.
- Concurrent: Ability to work with threads.
- Static: Data types of each variable must be declared before runtime.
- Strong: To prevent operations between incompatible types.
- Safe: Further checks (through compiler and JVM) to ensure code follows type rules and prevent errors such as: 
`Classcastexceptions`, `Arraystoreexceptions` etc. and array bounds checking and null reference checking prevent
memory corruption and undefined behaviours.


## Short History of Java 

Java programming language came into existence through the work of James Gosling in 1994. He was working at Sun 
Microsystems at the time. 


## Java Compiler

Compiler is a program that translates source code (high-level language) into bytecode . 
Java compiler is called `javac`.
Bytecode: A number less then a byte and paired with a mnemonic.

Check bytecode file: `https://hexed.it/`

JVM is the java virtual machine which allows any machine to run java bytecode. Bytecode are instructions 
which dictates the VM of how to process the code into machine code. JVM has two purposes: 1. To run java code on 
any machine. 2. To optimize program memory.

`.java` file is the code file. `.class` file is the compiled file.

NOTE: javac expects a FILENAME(sum.java) while java expects a CLASSNAME(sum). 

`javac herb.java` //javac means java compiler.

`java herb`

OUTPUT == WEED IS LIFE!!

Compiler checks the syntax of the source code and compiles it into bytecode.
`javac` is the de facto compiler.
JVM Loads the bytecode and executes it. This gives us the output.
There are multiple JVM: Hotspot JVM (the one I am using), ART (Android Runtime), GraalVM etc.

Note: Java is both a compiler(JIT, Java compiler) and interpreter(JVM).

Q. How do you run source code in a package through cmd?

A. Once the java.class file is created in the subpackage folder. Then move to the source root level and
then run the run command with dir path to the class file. For instance: `java subpackage/classname.class`

Go to the source root directory (`coding_prep`) and then do `java neetcode.xyz`. JVM only looks or starts in 
source folder by default.


## Keywords

- abstract
- assert
- boolean
- break
- ~~byte~~
- case
- catch
- ~~char~~
- class
- const
- continue
- default
- do
- ~~double~~
- else
- extends
- false
- final
- finally
- ~~float~~
- ~~for~~
- goto
- ~~if~~
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
- ~~public~~
- return
- ~~short~~
- static
- strictfp
- super
- switch


## Java Versions

Currently, I am using `Java 21`.

JDK is the complete tools needed to build and run a java program. This includes:

- javac (compiler), 
- java ( The launcher that runs compiled Java programs by invoking the JVM)
- javadoc
- jar
- jps (Java Virtual Machine Process Status Tool: A tool to monitor active JVM processes).


Each new java version includes updates, new features and performance improvements.

Here the famous java versions:

- java8 (2014): lambda expressions
- java11 (2018): HTTP support
- java17 (2021): sealed class finalized
- java21 (2023): sequenced collections in the standard library

## Java Data Types

A type is a set of values and operations on them. A type is either a primitive or reference type.

Boolean (1-bit): True or false
byte (8-bit): 128
short (16 bit): 32767
int (32 bit): 1237120931023701
long (64-bit): ....
float (32-bit): ....
double (64-bit): ...
char (16-bit): This contains the ASCII (American Standard Code for Information Interchange) characters. This starts
               with ''.

Primitive types are NOT objects and are directly stored in the 
memory. 

Variables are values that store data. There are three types
of variables:

- Local Variable: Declared inside a method.
- Instance Variable: Outside of method.
- Static Variable: Outside of method.

Pass-by-value:

Pass-by-reference:

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
- public	      Yes	         Yes	                Yes	                          Yes
- private	      Yes	          No	                 No	                           No
- protected	  Yes	         Yes	                Yes	                           No
- default	      Yes	         Yes	                 No	                           No


Other Modifiers: These add extra layer of accessibilty of the classes, methods and fields
These are the following:

- static: Used for class-level variables and methods.
- final: Used to define constants, prevent inheritance, and prevent method overriding.
- abstract: Used to define abstract classes and methods that must be implemented in subclasses.
- synchronized: Used to make methods or blocks of code thread-safe in concurrent programming.
- native: Used to declare methods implemented in a language other than Java (typically C or C++).


## Arrays, Strings





## Objects

OOP (Object-Oriented Programming) is the heart of Java. 

What is a class? 

What is an object?

`==` checks for reference equality. It checks whether the two comparing parts share the same object in 
memory.


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
- [SIMD-Java](https://jbaker.io/)
- [JEP483](https://www.morling.dev/blog/jep-483-aot-class-loading-linking/)
- [Tail-recursion](https://unlinkedlist.org/2023/03/19/tail-call-recursion-in-java-with-asm/)
- [Java-everything](https://www.teamten.com/lawrence/writings/java-for-everything.html)
- [Java-Uber](https://www.uber.com/en-IL/blog/fixrleak-fixing-java-resource-leaks-with-genai/)
