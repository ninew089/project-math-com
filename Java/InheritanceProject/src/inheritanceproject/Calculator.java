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
public class Calculator {
    private double number1;
    private double number2;
    private double result;
    public Calculator(double number1,double number2) {
        this.number1=number1;
        this.number2=number2;
        this.result=0;
    }

    public double plus() {
        result =number1+number2;
        return getResult();
    }
    
    public double minus() {
        result = number1-number2;
        return getResult();
    }
    
    /**
     * @return the number1
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * @return the number2
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    
}
