package uestc.glimmerjava3;

import java.util.*;

public class Student {
    private String name;
    private Map<String, Integer> subjectErrors = new HashMap<>();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
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
     * @return subjectErrors
     */
    public Map<String, Integer> getSubjectErrors() {
        return subjectErrors;
    }

    public void addError(String subject, int count) {
        subjectErrors.put(subject, subjectErrors.getOrDefault(subject, 0) + count);
    }


    public String toString() {
        return "Student{name = " + name + ", subjectErrors = " + subjectErrors + "}";
    }
}
