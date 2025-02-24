class TaxCalculator{
    final double GST_RATE = 0.18;
    public final void displayGST(){
        System.out.println("GST Rate: "+GST_RATE);
    }

}
class Invoice extends TaxCalculator{
    public void calculateTotalWithTax(double amount){
        double total = amount + (amount * GST_RATE);
        System.out.println("Total Amount with GST: "+total);
    }
    // @Override
    // public void displayGST(){
    //     System.out.println("GST Rate: "+GST_RATE);
    // }
}
public class Question1Tax {
    public static void main(String[] args) {
        Invoice aInvoice = new Invoice();
        aInvoice.displayGST();
        aInvoice.calculateTotalWithTax(1000);
        // aInvoice.GST_RATE = 0.20;
    }
}
