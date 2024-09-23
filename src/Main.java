public class Main
{
    public static void main(String[] args)
    {
        double SALES_TAX = .05;
        double purchasePrice = 55.37;
        double compSale = 0;
        compSale = purchasePrice * SALES_TAX;
        System.out.println("The price is " + purchasePrice + " and sales tax is " + compSale );
    }
}