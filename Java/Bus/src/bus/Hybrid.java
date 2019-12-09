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
public class Hybrid extends Bus implements LiquidFuel,Electric{
    private double voltage, range;
    private int emissionTier;
    Hybrid(int cap,double cos,double vol,double ran,int emi){
        super(cap,cos);
        voltage=vol;    range=ran;  emissionTier = emi;
    }
    @Override
    public double getRange(){return range;}
    @Override
    public int getEmissionTier(){return emissionTier;}
    @Override
    public double getVoltage(){return voltage;}
    @Override
    public double getAccel(){return 4.0;}
}

