package day06_ifStatement;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);
        System.out.println( (5 + 2) * 3);

        System.out.println( 6 < 9 == 4>7 );
        //                  true == false
        //                      false

        System.out.println( 6 < 9 == 4>7 && "java" == "python" || 'a' == 'A' );
        //                true == false  && "java" == "python" || 'a' == 'A'
        //                    false      &&      false         ||    false
        //                              false                  ||    false
        //                                                    false





    }




}
