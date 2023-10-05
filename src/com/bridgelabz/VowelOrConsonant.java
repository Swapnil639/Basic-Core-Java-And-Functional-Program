package com.bridgelabz;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter one character:");
        char ch=Utility.scannerChar();
        findVowelOrConsonant(ch);
    }

    public static void findVowelOrConsonant(char ch) {
        switch (ch){
            case 'a':
                System.out.println(ch+" is Vowel");
                break;
                case 'e':
                System.out.println(ch+" is Vowel");
                break;
                case 'i':
                System.out.println(ch+" is Vowel");
                break;
                case 'o':
                System.out.println(ch+" is Vowel");
                break;
                case 'u':
                System.out.println(ch+" is Vowel");
                break;
            default:
                System.out.println(ch+" is Consonant");
                break;
        }
    }

}
