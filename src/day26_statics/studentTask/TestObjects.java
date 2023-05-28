package day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("karem", 24, 'F', "B23");


        Student [] students ={ student1, student2};

        StudentsGroup group1 = new StudentsGroup("java turtles", 1);

        group1.addStudent(student1);

        group1.addStudent(student2);


        group1.addStudent("Mark", 35,'M', "F15");

        System.out.println(group1);

        group1.removeStudent("A16");

        System.out.println(group1);



    }




}
