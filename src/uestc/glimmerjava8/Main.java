package uestc.glimmerjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // 测试数据：学生列表
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 58),
                new Student("Charlie", 90),
                new Student("David", 45),
                new Student("Eve", 72),
                new Student("Frank", 60),
                new Student("Grace", 55),
                new Student("Heidi", 95)
        );

        // 请在这里补充代码，完成以下任务：
        // 1. 过滤分数≥60的学生
        // 2. 姓名转换成大写
        // 3. 按姓名字母顺序排序
        // 4. 收集成 List<String> 返回并打印

        // --- 你的代码开始 ---

        List<String> passingStudents;
        passingStudents = students.stream()
                .filter(s -> s.getScore() >= 60)
                .map(s -> s.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());


        // --- 你的代码结束 ---

        // 打印结果
        System.out.println(passingStudents);
    }
}
