## **Task1.安装JDK**

---

### JDK是什么

**JDK**全名是Java Development Kit

此处是Oracle官网给出的解释

>The JDK is a ***development environment for building applications***, ***applets***, and ***components using the Java programming language***.
>
>The JDK includes tools useful for ***developing and testing programs*** written in the Java programming language and ***running*** on the Java platform.

---

简而言之,JDK主要有三个组成部分

1.**JRE**(Java Runtime Environment)

2.**Development Tools**（包含编译工具javac，运行工具java等等）

3.**API**(包含大量自带的JAVA标准类库)

---





## **Task2.配置环境变量**

---

### 我配置了什么环境变量

1.设置JAVA_HOME,以指向安装的 JDK 根目录

2.将JDK的bin加入到PATH中

---

### 为什么配置了环境变量后，就能在命令行使用相关命令了

**因为操作系统寻找可执行文件路径的规则**

1.在PATH中寻找

2.在当前文件夹中寻找

3.如果没有寻找到，则无效命令

**所以上述配置的两个环境变量的原因：**

1.配置 `JAVA_HOME` → 明确告诉系统 **JDK 装在哪**。

2.把 `$JAVA_HOME/bin` 加到 `PATH` → 在任意目录下都能敲 `java`、`javac`，不必每次写完整路径。

---

## Task3.编译和运行

---

### 代码执行结果的命令行截图

![](/Users/yunqiao/Desktop/截屏2025-09-22 23.29.16.png)

---

### 编译和运行过程中涉及的文件和这些文件的作用

`javac HelloJava.java`:

1.HelloJava.java是可供人类阅读的源代码文件

2.使用javac编译器将HelloJava.java文件编译为.class文件(跨平台的字节码)

3.Java uestc.glimmerjava1.HelloJava是将uestc.glimmerjava1(Package)中的HelloJava字节码文件交由操作系统执行
