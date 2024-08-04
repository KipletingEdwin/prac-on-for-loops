import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word to check");
        String checkWord = scanner.nextLine();
        System.out.println("You just typed the word " + checkWord);
        System.out.println(checkWord.length());


        for(int i = 0; i < checkWord.length(); i++){
            System.out.println(checkWord.charAt(i));
        }



//        System.out.println("--------------------------------");
//
//        for(int j = checkWord.length() - 1; j >= 0; j-- ){
//            System.out.println(checkWord.charAt(j));
//        }



    }
}