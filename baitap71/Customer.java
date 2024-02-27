package baitap71;

public class Customer {

	String name;
    String membershipType;

    Customer(String name, String membershipType) {
        this.name = name;
        this.membershipType = membershipType;
    }

    String getMembershipType() {
        return membershipType;
    }
}

