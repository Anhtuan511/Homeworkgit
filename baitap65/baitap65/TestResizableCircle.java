package baitap65;

public class TestResizableCircle {

	    public static void main(String[] args) {
	        ResizableCircle circle = new ResizableCircle(5.0);

	        System.out.println("Chu vi ban dau: " + circle.getPerimeter());
	        System.out.println("Dien tich ban dau: " + circle.getArea());

	        circle.resize(50);

	        System.out.println("Chu vi sau khi thay doi: " + circle.getPerimeter());
	        System.out.println("Dien tich sau khi thay doi: " + circle.getArea());
	    }
	}

