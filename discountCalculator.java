public class discountCalculator{
    public static void main (String[] args){

        double pricePerItem = 200;
        int quantity = 24;
        double discount = 0.0;
      

        if(quantity > 20){
            discount = 0.2;
        }
        else if(quantity > 10){
            discount = 0.1;
        }
     

        double totalCost = pricePerItem * quantity;
        double finalPrice = totalCost - (totalCost * discount);

        System.out.println("Final Price = Php" + finalPrice);
    }
}