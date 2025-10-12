## Q1:Error与Exception的区别

### Error(错误):

**程度更重**

表示**系统级的严重问题**，通常是程序无法处理或恢复的，比如内存溢出（`OutOfMemoryError`）、栈溢出（`StackOverflowError`）等。
**特点**：发生时通常无法通过代码修复或恢复，程序应当**终止运行**。

### Exception(异常):

**程度较轻**

表示**程序运行中可预料的问题**，例如文件找不到（`FileNotFoundException`）、数组越界（`ArrayIndexOutOfBoundsException`）等。
**特点**：可以通过编程手段**捕获并处理**，程序可以继续运行或给出提示。



## Q2: checked异常与unchecked异常

### unchecked异常发生原因：

一般是本身程序逻辑错误引起的异常

e.g. 空指针问题，数学计算问题等



### checked异常发生原因:

一般来说并不是由本身程序逻辑错误引起的异常，而是外部因素引起的异常

e.g. 文件访问问题，网络问题，数据库问题等



### 二者区别:

1. 继承体系不同：unchecked异常继承于`RuntimeException`，而checked异常继承于`Exception`

2. unchecked不要求强制处理(可以在程序中修改代码逻辑处理)

   checked则要求强制处理(在程序中用`try-catch`或`throw`处理)

3. 造成异常的原因不同



## Q3:文件读取和数据处理

详见`FileLoader`和`EmptyFileException`



## Q4:执行代码

运行结果

`limit = java.util.stream.SliceOps$1@24d46ca6`

原因

1. Stream是惰性求值，该类只会在调用终止操作时才会真正执行流上的所有操作
2. limit()方法不是终止操作，它属于中间操作
3. 此时打印的是一个对象引用(指向堆中的对象)



## Q5:完成Stream

详见`Student`和`Main`

