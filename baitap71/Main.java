package baitap71;

public class Main {
	public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice", "Premium");
        Customer customer2 = new Customer("Bob", "Gold");
        Customer customer3 = new Customer("Charlie", "Silver");
        Customer customer4 = new Customer("David", null); // Non-member

        // Create visits
        Visit visit1 = new Visit(customer1, 50, 100); // $50 products, $100 services
        Visit visit2 = new Visit(customer2, 80, 150); // $80 products, $150 services
        Visit visit3 = new Visit(customer3, 30, 70);  // $30 products, $70 services
        Visit visit4 = new Visit(customer4, 60, 120); // $60 products, $120 services

        // Calculate total bill for each visit
        System.out.println("Total bill for visit 1: " + visit1.totalBill());
        System.out.println("Total bill for visit 2: " + visit2.totalBill());
        System.out.println("Total bill for visit 3: " + visit3.totalBill());
        System.out.println("Total bill for visit 4: " + visit4.totalBill());
    }
}
