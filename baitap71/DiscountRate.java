package baitap71;

public class DiscountRate {
	static double premiumDiscount = 0.20;
    static double goldDiscount = 0.15;
    static double silverDiscount = 0.10;

    static double getServiceDiscount(String memberType) {
        switch (memberType) {
            case "Premium":
                return premiumDiscount;
            case "Gold":
                return goldDiscount;
            case "Silver":
                return silverDiscount;
            default:
                return 0.0;
        }
    }

    static double getProductDiscount() {
        return 0.10;
    }
}

