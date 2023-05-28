package day08_ternary_switch;

public class FieldTrip {

    public static void main(String[] args) {

        /*
        2. Create a class called FieldTrip. Your school goes on a Field trip each year.The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	number of groups - 0
			        	teacher in charge - Unknown
         */


        int grade = 9,
                numberGroup = 9;
        String location = "",
                teacher = "";


        if (grade >= 1 && grade <= 6){

            if (grade == 1){
                location = "Apple orchard";
                numberGroup = 3;
                teacher = "Ms. Smith";
            }else if (grade ==2){
                location = "Zoo";
                numberGroup = 7;
                teacher = "Mr. Lee";
            }else if (grade ==3){
                location = "Aquarium";
                numberGroup = 5;
                teacher = "Ms. Wilson";
            }else if (grade ==4){
                location = "Movie theater";
                numberGroup = 2;
                teacher = "Mr. Reyes";
            }else if (grade ==5){
                location = "Museum";
                numberGroup = 5;
                teacher = "Ms. Lela";
            }else{
                location = "Six Flags";
                numberGroup = 8;
                teacher = "Mr. Watt";
            }




        }else{
            location = "unknown";
            numberGroup = 0;
            teacher = "unknown";
        }


        System.out.println("Grade : " + grade);
        System.out.println("location = " + location);
        System.out.println("number of groups = " + numberGroup);
        System.out.println("teacher in charge = " + teacher);











    }



}
