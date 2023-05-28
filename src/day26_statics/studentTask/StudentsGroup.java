package day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId)/*, ArrayList<Student> students)*/ {
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); // size: 0
    }

    public void addStudent(Student student){ // Takes one student object and adds it to the arrayList of students
        students.add(student);
    }

    public void addStudent ( String name, int age, char gender, String id){
       // Student student = new Student(name, age, gender, id);
        students.add( new Student(name, age, gender, id));
    }

    public void addStudent (Student[] students ){
        this.students.addAll(Arrays.asList(students));
    }

    public void removeStudent(String id){
        students.removeIf( p -> p.id.equals(id));
    }

    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
