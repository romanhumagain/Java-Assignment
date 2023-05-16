package LabAssign;

import practice.Calculator;

public class CalculatorTest {
public static void main(String[] args ) {

Calculator cal = new Calculator(); //Memory Allocation
cal.setNum1(50);
cal.setNum2(40);
cal.getNum3();
cal.sum();

System.out.println(cal.getNum3()); //displaying assigned value

}
}
