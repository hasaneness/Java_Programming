package week4_morning;

import java.util.Scanner;

public class SmsParts {

    public static void main(String[] args) {

/*
    SmsParts [substring, indexOf]

    Create a program that will has a message String in this exact format:

        Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

    The content of name, number and message can vary, so based on the format extract those parts and output them.

    Ex:
    Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

    Output:
        Sender: Omer Karahan
        Number: 202-123-3456
        Message: I love programming and problem solving
     */


        Scanner input = new Scanner(System.in);

        System.out.println("Sender name:");
        String sender =input.nextLine();
        System.out.println("Enter the message:");
        String message = input.nextLine();
        System.out.println("enter the phone number");
        int num = input.nextInt();

        String msg = "Sender:  < "+ sender + " >. From Number: " +num+ " Message: {" + message;


        System.out.println(msg);


    }




}
