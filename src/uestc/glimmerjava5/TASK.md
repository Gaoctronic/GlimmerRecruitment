## TASK1.对象和类

### 1.代码实现

```java
package uestc.glimmerjava5;

public class Person {
    private String name;
    private int age;
    private char sex;

    public Person() {
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void eat() {
        System.out.println(name+"正在吃东西");
    }

    public void sleep() {
        System.out.println(name+"正在睡觉");
    }

    public void dadoudou() {
        System.out.println(name+"正在打豆豆");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}

```

### 2.类与对象的关系

对象是依据类而创造出来的实例

一个类可以创造许多到不同对象

而一个对象对应了一个类

类描述的是同类物体相同的共性

对象是具体的个体

### 3.修饰符

**`private`** → 只能在类内部访问

**`default`**（默认情况）→ 只能在同一包内访问

**`protected`** → 同包可以访问，跨包时只能被子类(extends)访问

**`public`** → 所有地方都能访问



## TASK2.类中的变量和方法

类中的静态方法不需要先创建实例再引用方法，而可以直接通过类名调用方法