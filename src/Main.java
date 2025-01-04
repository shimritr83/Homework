import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();
        String []names={"talya","betty","keliy","yulia","paula","maily","bella","neomi","annie","golda"};
        String secretWord=names[random.nextInt(0,10)];
        String userChoice;
        String feedback="";
        boolean isWinner=false;
        for (int i=0;i<6;i++) {
            do {
                System.out.println("please enter a word in length 5");
                userChoice = scanner.nextLine();
            } while (userChoice.length() != 5);
            if (userChoice.equals(secretWord)) {
                isWinner = true;
                break;
            } else {
                for (int j = 0; j < secretWord.length(); j++) {
                    if (secretWord.charAt(j) == userChoice.charAt(j)) {
                        feedback = feedback + "G";
                    } else if (secretWord.contains(userChoice.charAt(j) + "")) {
                        feedback = feedback + "y";
                    } else {
                        feedback = feedback + "_";
                    }
                }
                System.out.println(feedback);
                feedback = "";
            }
        }
        if(isWinner==true) {
            System.out.println("winner");
        }else{
            System.out.println("you lose and the secret word "+secretWord);

        }
    }
}


