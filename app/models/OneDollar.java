package models;

import java.math.BigDecimal;


public class OneDollar
{
    private int year;
    private int serialNumber;

    OneDollar(int year, int serialNumber)
    {
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("1.00");
    }
    public int getYear()
    {
        return year;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public String toString()
    {
        return "One"+"\t"+"Year: "+year+"\t"+"Serial Number: "+serialNumber;
    }
}
