public class question1Pattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--){
            System.out.print(" ".repeat(5-i));
            System.out.println("*".repeat(i));
        }
    }
}
