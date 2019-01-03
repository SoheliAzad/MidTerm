package string.problems;

import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingStringProblem {
    public static void main(String[] args) throws java.lang.AssertionError{
        //Apply Unit Test into all the methods in this package.

        //Unit test for the Longest word
        try {
            String str1 = "We are the November 2018 team";
            Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str1),"November");
            System.out.println("Unit test for the largest word is Passed.");
        }catch (AssertionError as){
            System.out.println("Unit test for the largest word is failed");
        }

        //Unit test for Anangram Problem
        try {
            Assert.assertEquals(Anagram.isAnagram("November","rebmevon"),true);
            System.out.println("Anagram unit test is Passed.");
        }catch (AssertionError as){
            System.out.println("Anagram unit test is failed");
        }

        //unit testing for palindrome
        try {//Unit test for palindrome
            String str2 = "eye";
            boolean expected = true;
            Assert.assertEquals(Palindrome.isPalindrome(str2),expected);
            System.out.println("Palindrome unit test is passed.");
        } catch (AssertionError as){
            System.out.println("Palindrome unit test is failed.");
        }
    }
}



