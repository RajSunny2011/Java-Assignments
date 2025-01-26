import java.util.Scanner;

public class question4ReverseSentence {
    public static void main(String[] args) {
        String sentence;
        try (Scanner in = new Scanner(System.in)){
            sentence = in.nextLine();
        }
        String splitSentence[] = sentence.split(" ");
        for (int i = splitSentence.length-1; i>=0; i--){
            System.out.print(splitSentence[i]+" ");
        }
    }
}
