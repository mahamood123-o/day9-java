import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        int numbers = 0;
        int specials = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            
            if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isLetter(c)) {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specials++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specials);
    }
}