/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author apple
 */
public class CNGBus extends Bus implements LiquidFuel {
    double range;
    int emissionTier;
    CNGBus(int capacity,double cost,double range,int emissionTier){
        super(capacity,cost);
        range=range;
        emissionTier=emissionTier;
        
    }

    @Override
    public double getAccel() {
      return 4.00;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public int getEmissionTier() {
        return  emissionTier;
    }
    
}
