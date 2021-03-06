package models;

import java.math.BigDecimal;

public class TwentyDollar
{
    private int year;
    private int serialNumber;

    TwentyDollar(int year, int serialNumber)
    {
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public static BigDecimal getFaceValue()
    {
        return new BigDecimal("20.00");
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
        return "Twenty"+"\t"+"Year: "+year+"\t"+"Serial Number: "+serialNumber;
    }
}
