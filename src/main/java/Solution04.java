/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David beers
 */

/*
*   print user prompt for noun
*   store the input noun
*   print user prompt for a verb
*   store the verb
*   print user prompt for an adjective
*   store the adjective
*   print user prompt for adverb
*   store the adverb
*   print formatted output for the resulting MadLib
*   */

import java.util.Scanner;
public class Solution04 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun");
        String noun = input.next();
        System.out.println("Enter a verb");
        String verb = input.next();
        System.out.println("Enter an adjective");
        String adjective = input.next();
        System.out.println("Enter an adverb");
        String adverb = input.next();
        input.close();

        System.out.printf("Did you see a %s %s %s %s? Must've been a sight!", adjective, noun, adverb, verb);
    }
}
