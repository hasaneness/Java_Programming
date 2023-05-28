package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Katerina",29,'F');
        CydeoStudent student2 = new CydeoStudent("Jonas", 27, 'M');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);





    }



}
