import java.util.Scanner;
public class question2Bill {
    public static int calculateBill(int totalUnits){
        int charge = 0, currentBracket = 0;
        int chargeBrackets[] = {5,7,10,15};
        while (totalUnits >= 100 && currentBracket < 3){
            charge += chargeBrackets[currentBracket] * 100;
            totalUnits -= 100;
            currentBracket += 1;
        }
        charge += totalUnits>0 ? (chargeBrackets[currentBracket] * totalUnits) : 0;
        return charge;
    }

    public static void main(String[] args) {
        int totalUnits, charge;
        try (Scanner in = new Scanner(System.in)){
            System.out.print("Enter total Units: ");
            totalUnits = in.nextInt();
        }
        charge = calculateBill(totalUnits);
        System.out.println("Total Bill: " + charge);
    }
}
