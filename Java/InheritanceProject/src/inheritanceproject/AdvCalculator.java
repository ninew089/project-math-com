/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject;

/**
 *
 * @author werapan
 */
public class AdvCalculator extends Calculator{
    // hint : จะเข้าถึง attribute ของ parent class ต้องทำผ่าน getter และ setter method
    // สร้าง Constructor ที่เหมือนกันกับ Calculator
    public AdvCalculator(double num1, double num2) {
        super(num1,num2);
    }
    // สร้าง multiply มีรูปแบบ interface แบบเดียวกับ add และ minus
    public double multiply() {
        setResult(getNumber1()*getNumber2());
        return getResult();
    }
    // สร้าง division มีรูปแบบ interface แบบเดียวกับ add และ minus
    public double division() {
        setResult(getNumber1()/getNumber2());
        return getResult();
    }
    // สร้าง power มีรูปแบบ interface แบบเดียวกับ add และ minus
    public double power() {
        setResult(Math.pow(getNumber1(),getNumber2()));
        return getResult();
    }
}
