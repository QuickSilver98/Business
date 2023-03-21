public class Business {
    private double buyingPrice;
    private double sellingPrice;
    private double transportCost;

    public Business(double buyingPrice,double transportCost,double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.transportCost = transportCost;
    }


    public Business(){
        this.buyingPrice = 0;
        this.sellingPrice = 0;
        this.transportCost = 0;
    }

    public static void main(String[] args) {
        Business theBusiness = new Business(100,50,200);
        theBusiness.calculateProfitOrLoss();
    }

    public  void calculateProfitOrLoss(){
        double totalCost;
        double profit;

        totalCost = this.buyingPrice + this.transportCost;
        profit = this.sellingPrice - totalCost;

        if(profit > 0){
            System.out.println("You have made a profit of " + profit);
        } else if (profit < 0) {
            System.out.println("You have incurred a loss of " + profit);
        }else{
            System.out.println("No profit or loss");
        }
    }

}
