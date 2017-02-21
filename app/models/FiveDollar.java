package models;

import java.math.BigDecimal;

public class FiveDollar
{
    private int year;
    private int serialNumber;

    FiveDollar(int year, int serialNumber)
    {
        this.year=year;
        this.serialNumber = serialNumber;
    }
    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("5.00");
    }
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public int getYear()
    {
        return year;
    }
    public String toString()
    {
        return "Five"+"\t"+"Year: "+year+"\t"+"Serial Number: "+serialNumber;
    }
}

