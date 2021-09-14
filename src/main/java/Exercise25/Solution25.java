/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise25;

import java.util.*;

public class Solution25
{
    public static void passwordValidator(String input)
    {
        int num = input.length();
        boolean lowerCase = false, upperCase = false, number = false, character = false;
        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                lowerCase = true;
            if (Character.isUpperCase(i))
                upperCase = true;
            if (Character.isDigit(i))
                number = true;
            if (set.contains(i))
                character = true;
        }


        if ((num >= 8)&& number && lowerCase || upperCase && character)
            System.out.println("The password " + input + " is a very strong password.");
        else if ((num >= 8) && (lowerCase || upperCase || character)  )
            System.out.println("The password " + input + " is a strong password.");
        else if(num <  8 && lowerCase || upperCase)
            System.out.print("The password " + input + " is a weak password.");
        else
            System.out.print("The password " + input + " is a very weak password.");
    }

    public static void main(String[] args)
    {
        String password;
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter a password to determine how strong it is: ");
        password = scan.nextLine();
        passwordValidator(password);

    }


}
