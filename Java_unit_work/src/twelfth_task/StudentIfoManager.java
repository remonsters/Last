package twelfth_task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentIfoManager {
    public static void main(String[] args) {
        traversalAndRecord(inputInfo());
    }
    private static void traversalAndRecord(TreeSet<Student> infos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("infos.txt"))) {
            for (Student info : infos) {
                writer.write(info.getId() + info.getName() + info.getAge());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static TreeSet<Student> inputInfo() {
        TreeSet<Student> infos = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        Scanner sc = new Scanner(System.in);
        String input;
        while (!(input = sc.next()).equals("exit")) {
            String[] s = input.split(" ");
            Student student = encapsulate(s[0], s[1], Integer.parseInt(s[2]));
            infos.add(student);
        }
        return infos;
    }
    private static Student encapsulate(String id, String name, int age) {
        return new Student(id, name, age);
    }
}