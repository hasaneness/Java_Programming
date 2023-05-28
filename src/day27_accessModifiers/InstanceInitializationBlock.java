package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*
    {
        name = "James";
        age = 20;
    }

     */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "InstanceInitializationBlock{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("james", 45);

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("joshua", 27);



        System.out.println(obj1);
        System.out.println(obj2);
    }


}
