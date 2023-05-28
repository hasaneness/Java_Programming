package week4_morning;

public class T3Habitat {

    public static void main(String[] args) {

        String habitat = "grassland";
        String animals = "";



        switch (habitat) {
            case "grassland":
                animals = " snakes, tigers, gorillas";
                break;

            case "jungle":
                animals = "snakes, tigers, gorillas";
                break;

            case "city":
                animals = " dogs, cats, gulls, squirrels";
                break;

            case "safari":
                animals = "lion, tiger";
                break;

            default:
                System.err.println("Invalid habitat");
                System.exit(1);
                break;


        }

        System.out.println("In the " + habitat + " you will be able to find : " +
                animals);


    }
}
