import java.util.Scanner;

public class VowelOrConsonant 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char characterInput = input.next().charAt(0);
        
        if((characterInput >= 'a' && characterInput <= 'z') || 
                (characterInput >= 'A' && characterInput <= 'Z'))
        {
            switch(characterInput)
            {
                case 'a': System.out.println(characterInput + " is a vowel");
                break;
                case 'A': System.out.println(characterInput + " is a vowel");
                break;
                case 'e': System.out.println(characterInput + " is a vowel");
                break;
                case 'E': System.out.println(characterInput + " is a vowel");
                break;
                case 'i': System.out.println(characterInput + " is a vowel");
                break;
                case 'I': System.out.println(characterInput + " is a vowel");
                break;
                case 'o': System.out.println(characterInput + " is a vowel");
                break;
                case 'O': System.out.println(characterInput + " is a vowel");
                break;
                case 'u': System.out.println(characterInput + " is a vowel");
                break;
                case 'U': System.out.println(characterInput + " is a vowel");
                break;
                default: System.out.println(characterInput + " is a consonant");
                break;
            }
        }
        else
        {
            System.out.println(characterInput + " is an invalid input");
        }
    }
    
}
