package Assignment;

public class Exe1 {
	  public static final double INCH_TO_MM = 25.4;
	  public static final double LENGTH_INCHES = 11;
	  public static final double WIDTH_INCHES = 8.5;

	  public static void main(String[] args) {
	    double lengthMm = LENGTH_INCHES * INCH_TO_MM;
	    double widthMm = WIDTH_INCHES * INCH_TO_MM;

	    System.out.println("Length:"+ lengthMm + " mm");
	    System.out.println("Width:"+ widthMm + " mm");
	  }
	}
