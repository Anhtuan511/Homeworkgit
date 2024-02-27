package baitap71;

public class Visit {
	 Customer customer;
	    double productsCost;
	    double servicesCost;

	    Visit(Customer customer, double productsCost, double servicesCost) {
	        this.customer = customer;
	        this.productsCost = productsCost;
	        this.servicesCost = servicesCost;
	    }

	    double totalBill() {
	        String membershipType = customer.getMembershipType();
	        double serviceDiscount = membershipType != null ? DiscountRate.getServiceDiscount(membershipType) : 0.0;
	        double totalServicesCost = servicesCost * (1 - serviceDiscount);
	        double totalProductsCost = productsCost * (1 - DiscountRate.getProductDiscount());
	        return totalServicesCost + totalProductsCost;
	    }
	}