package Example;

public class BusinCal {
    
    // 1. Calculate Profit (cost price, selling price)
    void Calculate(double costPrice, double sellPrice) {
        double profit = sellPrice - costPrice;
        System.out.println("Profit price = " + profit);
    }

    // 2. Calculate Loss % (with profit/loss check)
    void Calculate(double costPrice, double sellPrice, int mode) {

        if (sellPrice < costPrice) {
            double loss = costPrice - sellPrice;
            double lossPercent = (loss / costPrice) * 100;
            System.out.println("It is a LOSS");
            System.out.println("Loss Percentage = " + lossPercent + "%");
        } else {
            double profit = sellPrice - costPrice;
            System.out.println("It is a PROFIT");
            System.out.println("Loss Percentage not applicable.");
            System.out.println("Profit = " + profit);
        }
    }

    // 3. Calculate price after discount (marked price, discount %)
    void Calculate(float markedPrice, float discountPercent) {
        float discountAmount = (markedPrice * discountPercent) / 100;
        float finalPrice = markedPrice - discountAmount;

        System.out.println("Discount Amount = " + discountAmount);
        System.out.println("Price After Discount = " + finalPrice);
    }

    // 4. Calculate Simple Interest (principal, rate, time)
    void Calculate(int principal, float rate, int time) {
        float si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
