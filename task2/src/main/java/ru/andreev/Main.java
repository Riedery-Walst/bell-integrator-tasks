package ru.andreev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> staff = new ArrayList<>();

        Map<String, String> employee1 = new HashMap<>();
        employee1.put("name", "Петя");
        employee1.put("age", "24");
        employee1.put("job title", "devops");
        employee1.put("salary", "10000 руб");

        staff.add(employee1);

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("name", "John");
        employee2.put("age", "29");
        employee2.put("job title", "devops");
        employee2.put("salary", "10000$");

        staff.add(employee2);

        getNamesIfAgeGreaterThan30(staff);
        getNamesWithRubles(staff);
        getAverageAge(staff);
    }
    
    public static void getNamesIfAgeGreaterThan30(List<Map<String, String>> staff) {
        StringBuilder sb = new StringBuilder();
        for (Map<String, String> employee : staff) {
            int age = Integer.parseInt(employee.get("age"));

            if (age < 30)
                sb.append(employee.getOrDefault("name", "")).append(" ");
        }
        System.out.println(sb);
    }

    public static void getNamesWithRubles(List<Map<String, String>> staff) {
        StringBuilder sb = new StringBuilder();
        for (Map<String, String> employee : staff) {
            if (employee.getOrDefault("salary", "").contains("руб"))
                sb.append(employee.get("name")).append(" ");
        }
        System.out.println(sb);
    }

    public static void getAverageAge(List<Map<String, String>> staff) {
        int agesSum = 0;

        for (Map<String, String> employee : staff) {
            agesSum += Integer.parseInt(employee.getOrDefault("age", "0"));
        }

        float averageAge = (float) agesSum /staff.size();

        System.out.println(averageAge);
    }
}