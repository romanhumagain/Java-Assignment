package practice;

public class CalculatorTest {
public static void main(String[] args ) {

Calculator obj1 = new Calculator(); //Memory Allocation
obj1.setNum1(66);
obj1.setNum2(30);
obj1.getNum3();
obj1.sum();

System.out.println("SUM: "+obj1.getNum3()); //displaying assigned value
obj1.sub();
System.out.println("SUB: "+obj1.getNum3()); //displaying assigned value}
}
}