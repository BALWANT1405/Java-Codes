package com.topjavatutorial;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class anagram
 {
 
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter second string");
        String str2 = sc.nextLine();
        System.out.println("Checking for anagram returned " + isAnagram(str1,str2));
    }
    
    public static boolean isAnagram(String str1, String str2)
{
        char[] charArr1 = str1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        char[] charArr2 = str2.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        
        return(Arrays.equals(charArr1, charArr2));
 }
 
}

