import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int vowels = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            
           
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
        }   
        System.out.println("vowels:"+vowels);
    }
}