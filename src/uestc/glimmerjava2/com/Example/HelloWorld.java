package uestc.glimmerjava2.com.Example;

import uestc.glimmerjava2.com.Example.tool.Print;

public class HelloWorld {
    public static void main(String[] args) {
        Test.test();
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}

class Test {
    public static void test() {
        Print.print("Hello World");
    }
}
