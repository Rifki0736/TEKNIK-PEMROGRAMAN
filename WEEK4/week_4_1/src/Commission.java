/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR.IPI
 */
public class Commission extends Hourly {
    private double totSales;
    private double commRate;
    
    public Commission (String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double CRate){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        commRate=CRate;
        totSales=0;
    }
    
    public void addHours (int Hours){
        super.addHours(Hours);
    }
    
    public void addSales(double Sales){
        totSales += Sales;
    }
    
    @Override
    public double pay()
    {
        double payment = super.pay() + (totSales*commRate) ;
        totSales = 0;
        return payment;
    }
    
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totSales;
        return result;
    }
}
