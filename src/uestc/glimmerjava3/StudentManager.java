package uestc.glimmerjava3;

import java.util.*;

public class StudentManager {
    private Map<String, Student> students = new HashMap<>();

    public void addData(String studentName, String subject, int count) {
        students.putIfAbsent(studentName, new Student(studentName));
        students.get(studentName).addError(subject, count);
    }

    public void printSortedSubjects(String studentName) {
        Student student = students.get(studentName);
        if (student == null) {
            System.out.println(studentName + " 没有数据！");
            return;
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(student.getSubjectErrors().entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(studentName + " 的错题排序结果：");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
