package models;

import java.math.BigDecimal;

public class TenDollar
{
    private int year;
    private int serialNumber;

    TenDollar(int year, int serialNumber)
    {
        this.year = year;
        this.serialNumber = serialNumber;
    }
    public static BigDecimal getFaceValue()
    {
        BigDecimal faceValue = new BigDecimal("10.00");
        return faceValue;
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
        return "Ten"+"\t"+"Year: "+year+"\t"+"Serial Number: "+serialNumber;
    }
}
