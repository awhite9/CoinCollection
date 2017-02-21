package models;

import java.math.BigDecimal;


public class HundredDollar
{

        private int year;
        private int serialNumber;

        HundredDollar(int year, int serialNumber)
        {
            this.year = year;
            this.serialNumber=serialNumber;
        }
        public static BigDecimal getFaceValue()
        {
            return new BigDecimal("100.00");

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
            return "Hundred"+"\t"+"Year: "+year+"\t"+"Serial Number: "+serialNumber;
        }
}
