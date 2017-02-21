package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoinCollection
{


        public List<HundredDollar> listHundredDollar = new ArrayList<>();
        public List<TwentyDollar>listTwentyDollar = new ArrayList<>();
        public List<TenDollar>listTenDollar = new ArrayList<>();
        public List<FiveDollar>listFiveDollar = new ArrayList<>();
        public List<OneDollar>listOneDollar = new ArrayList<>();
        public List<Penny>listPenny = new ArrayList<>();
        public List<Dime>listDime = new ArrayList<>();
        public List<Nickle>listNickle = new ArrayList<>();
        public List<Quarter>listQuarter = new ArrayList<>();

        public List<HundredDollar> getListHundredDollar()
        {
            return listHundredDollar;
        }
        public List<TwentyDollar> getListTwentyDollar()
        {
            return listTwentyDollar;
        }
        public List<TenDollar> getListTenDollar()
        {
            return listTenDollar;
        }
        public List<FiveDollar> getListFiveDollar()
        {
            return listFiveDollar;
        }
        public List<OneDollar> getListOneDollar()
        {
            return listOneDollar;
        }
        public List<Penny> getListPenny()
        {
            return listPenny;
        }
        public List<Nickle> getListNickle()
        {
            return listNickle;
        }
        public List<Dime> getListDime()
        {
            return listDime;
        }
        public List<Quarter> getListQuarter()
        {
            return listQuarter;
        }
    public int hundredListCount()
    {
        return listHundredDollar.size();
    }
    public int twentyListCount()
    {
        return listTwentyDollar.size();
    }
    public int tenListCount()
    {
        return listTenDollar.size();
    }
    public int fiveListCount()
    {
        return listFiveDollar.size();
    }
    public int dollarListCount()
    {
        return listOneDollar.size();
    }
    public int quarterListCount()
    {
        return listQuarter.size();
    }
    public int dimeListCount()
    {
        return listDime.size();
    }
    public int nickleListCount()
    {
        return listNickle.size();
    }
    public int pennyListCount()
    {
        return listPenny.size();
    }
        public CoinCollection(BigDecimal cashAmount)
        {

            int hundredSN =1;

            while(cashAmount.compareTo(HundredDollar.getFaceValue())>0)
            {
                HundredDollar oneHundred = new HundredDollar(2000, hundredSN);
                listHundredDollar.add(oneHundred);
                hundredSN++;
                cashAmount = cashAmount.subtract(HundredDollar.getFaceValue());
            }
            for(HundredDollar list:listHundredDollar)
            {
                System.out.println(list);
            }
            int twentySN = 1;
            while(cashAmount.compareTo(TwentyDollar.getFaceValue())>0)
            {
                TwentyDollar twentyDollar = new TwentyDollar(2000, twentySN);
                listTwentyDollar.add(twentyDollar);
                twentySN++;
                cashAmount= cashAmount.subtract(TwentyDollar.getFaceValue());
            }
            for(TwentyDollar list:listTwentyDollar)
            {
                System.out.println(list);
            }
            int tenSN =1;
            while(cashAmount.compareTo(TenDollar.getFaceValue())>0)
            {
                TenDollar tenDollar = new TenDollar(2000, tenSN);
                listTenDollar.add(tenDollar);
                tenSN++;
                cashAmount = cashAmount.subtract(TenDollar.getFaceValue());
            }
            for(TenDollar list:listTenDollar)
            {
                System.out.println(list);
            }
            int fiveSN =1;
            while(cashAmount.compareTo(FiveDollar.getFaceValue())>0)
            {
                FiveDollar fiveDollar = new FiveDollar(2000, fiveSN);
                listFiveDollar.add(fiveDollar);
                fiveSN++;
                cashAmount = cashAmount.subtract(FiveDollar.getFaceValue());
            }
            for(TenDollar list:listTenDollar)
            {
                System.out.println(list);
            }
            int oneSN =1;
            while(cashAmount.compareTo(OneDollar.getFaceValue())>0)
            {
                OneDollar oneDollar = new OneDollar(2000, oneSN);
                listOneDollar.add(oneDollar);
                oneSN++;
                cashAmount = cashAmount.subtract(OneDollar.getFaceValue());
            }
            for(OneDollar list:listOneDollar)
            {
                System.out.println(list);
            }
            while(cashAmount.compareTo(Quarter.getFaceValue())>0)
            {
                Quarter quarter = new Quarter(2000);
                listQuarter.add(quarter);
                cashAmount = cashAmount.subtract(Quarter.getFaceValue());
            }
            for(Quarter list:listQuarter)
            {
                System.out.println(list);
            }
            while(cashAmount.compareTo(Dime.getFaceValue())>0)
            {
                Dime dime = new Dime(2000);
                listDime.add(dime);
                cashAmount = cashAmount.subtract(Dime.getFaceValue());
            }
            for(Dime list:listDime)
            {
                System.out.println(list);
            }
            while(cashAmount.compareTo(Nickle.getFaceValue())>0)
            {
                Nickle nickle = new Nickle(2000);
                listNickle.add(nickle);
                cashAmount = cashAmount.subtract(Nickle.getFaceValue());
            }
            for(Nickle list:listNickle)
            {
                System.out.println(list);
            }
            while(cashAmount.compareTo(Penny.getFaceValue())>0)
            {
                Penny penny = new Penny(2000);
                listPenny.add(penny);
                cashAmount = cashAmount.subtract(Penny.getFaceValue());
            }
            while(cashAmount.compareTo(Penny.getFaceValue())==0)
            {
                Penny penny = new Penny(2000);
                listPenny.add(penny);
                cashAmount = cashAmount.subtract(Penny.getFaceValue());

            }
            for(Penny list:listPenny)
            {
                System.out.println(list);
            }

        }


        public CoinCollection(int hundredCount, int twentyCount, int tenCount, int fiveCount, int oneCount, int quarterCount, int dimeCount, int nickleCount, int pennyCount )
        {

            for(int i=0; i<pennyCount; i++)
            {
                Penny penny = new Penny(2000);
                listPenny.add(penny);
            }

            for(int i=0; i<nickleCount; i++)
            {
                Nickle nickle = new Nickle(2000);
                listNickle.add(nickle);
            }
            for(int i =0; i<dimeCount; i++)
            {
                Dime dime = new Dime(2000);
                listDime.add(dime);
            }
            for(int i=0; i<quarterCount; i++)
            {
                Quarter quarter = new Quarter(2000);
                listQuarter.add(quarter);
            }
        }
        public void addHundredDollar(int year, int serialNumber)
        {
            if(existingHundredSerialNumber(serialNumber))
            {
                throw new IllegalArgumentException("Serial Number Already in ListArray of Hundred dollar bills");
            }
            else
            {
                HundredDollar hundredDollar = new HundredDollar(year, serialNumber);
                listHundredDollar.add(hundredDollar);
            }
        }
        public void addTwentyDollar(int year, int serialNumber)
        {
            if(existingTwentySerialNumber(serialNumber))
            {
                throw new IllegalArgumentException("Serial Number Already in ListArray of Twenty dollar bills");
            }
            else
            {
                TwentyDollar twentyDollar = new TwentyDollar(year, serialNumber);
                listTwentyDollar.add(twentyDollar);
            }

        }
        public void addTenDollar(int year, int serialNumber)
        {
            if(existingTenSerialNumber(serialNumber))
            {
                throw new IllegalArgumentException("Serial Number Already in ListArray of Ten dollar bills");
            }
            else
            {
                TenDollar tenDollar = new TenDollar(year, serialNumber);
                listTenDollar.add(tenDollar);
            }
        }
        public void addFiveDollar(int year, int serialNumber)
        {
            if(existingFiveSerialNumber(serialNumber))
            {
                throw new IllegalArgumentException("Serial Number Already in ListArray of Five dollar bills");
            }
            else
            {
                FiveDollar fiveDollar = new FiveDollar(year, serialNumber);
                listFiveDollar.add(fiveDollar);
            }
        }

        public void addOneDollar(int year, int serialNumber)
        {
            if(existingOneSerialNumber(serialNumber))
            {
                throw new IllegalArgumentException("Serial Number Already in ListArray of dollar bills");
            }
            else
            {
                OneDollar oneDollar = new OneDollar(year, serialNumber);
                listOneDollar.add(oneDollar);
            }
        }

        public void addPenny(int year)
        {
            Penny penny = new Penny(year);
            listPenny.add(penny);
        }
         public void addNickel(int year)
        {
            Nickle nickle = new Nickle(year);
            listNickle.add(nickle);
        }
        public void addDime(int year)
        {
            Dime dime = new Dime(year);
            listDime.add(dime);
        }
        public void addQuarter(int year)
        {
            Quarter quarter = new Quarter(year);
            listQuarter.add(quarter);
        }


        public BigDecimal getFaceValue()
        {
            return getPenniesFaceValue().add(getNickelsFaceValue()).add(getDimesFaceValue()).add(getQuartersFaceValue());
        }


        public BigDecimal getCollectibleValue()
        {
            return getPenniesCollectibleValue().add(getNickelsCollectibleValue()).add(getDimesCollectibleValue()).add(getQuartersCollectibleValue());
        }


    public BigDecimal getPenniesFaceValue()
        {
            BigDecimal pennyValue = new BigDecimal("0");
            for(int i=0; i<listPenny.size(); i++)
            {
                pennyValue = pennyValue.add(Penny.getFaceValue());

            }
            return pennyValue;

        }
    public BigDecimal getPenniesCollectibleValue()
        {
            BigDecimal pennyValue = new BigDecimal("0");
            for(Penny pennyListValue:listPenny)
            {
                pennyValue = pennyValue.add(pennyListValue.getCollectibleValue());

            }
            return pennyValue;
        }

    public BigDecimal getNickelsFaceValue()
        {
            BigDecimal nickleValue = new BigDecimal("0");
            for(int i =0; i<listNickle.size(); i++)
            {
                nickleValue = nickleValue.add(Nickle.getFaceValue());
            }
            return nickleValue;
        }
        public BigDecimal getNickelsCollectibleValue()
        {
            BigDecimal nickleValue = new BigDecimal("0");
            for(Nickle nickleListValue:listNickle)
            {
                nickleValue = nickleValue.add(nickleListValue.getCollectibleValue());
            }
            return nickleValue;
        }
        public BigDecimal getDimesFaceValue()
        {
            BigDecimal dimeValue = new BigDecimal("0");
            for(int i =0; i<listDime.size(); i++)
            {
                dimeValue = dimeValue.add(Dime.getFaceValue());
            }
            return dimeValue;
        }
        public BigDecimal getDimesCollectibleValue()
        {
            BigDecimal dimeValue = new BigDecimal("0");
            for(Dime dimeListValue:listDime)
            {
                dimeValue = dimeValue.add(dimeListValue.getCollectibleValue());
            }
            return dimeValue;
        }
        public BigDecimal getQuartersFaceValue()
        {
            BigDecimal quarterValue = new BigDecimal("0");
            for(int i=0; i<listQuarter.size(); i++)
            {
                quarterValue = quarterValue.add(Quarter.getFaceValue());
            }
            return quarterValue;
        }
        public BigDecimal getQuartersCollectibleValue()
        {
            BigDecimal quarterValue = new BigDecimal("0");
            for(Quarter quarterListValue:listQuarter)
            {
                quarterValue = quarterValue.add(quarterListValue.getCollectibleValue());
            }
            return quarterValue;
        }


        private boolean existingOneSerialNumber(int serialNumber)
        {
            boolean existingSerialNumber = false;
            for(OneDollar oneDollar:listOneDollar)
            {
                if(oneDollar.getSerialNumber() == serialNumber)
                {
                    existingSerialNumber = true;
                }
            }
            return existingSerialNumber;
        }

        private boolean existingFiveSerialNumber(int serialNumber)
        {
            boolean existingSerialNumber = false;
            for(FiveDollar fiveDollar:listFiveDollar)
            {
                if(fiveDollar.getSerialNumber() == serialNumber)
                {
                    existingSerialNumber = true;
                }
            }
            return existingSerialNumber;
        }

        private boolean existingTenSerialNumber(int serialNumber)
        {
            boolean existingSerialNumber = false;
            for(TenDollar tenDollar:listTenDollar)
            {
                if(tenDollar.getSerialNumber() == serialNumber)
                {
                    existingSerialNumber = true;
                }
            }
            return existingSerialNumber;
        }

        private boolean existingTwentySerialNumber(int serialNumber)
        {
            boolean existingSerialNumber = false;
            for(TwentyDollar twentyDollar:listTwentyDollar)
            {
                if(twentyDollar.getSerialNumber() == serialNumber)
                {
                    existingSerialNumber = true;
                }
            }
            return existingSerialNumber;
        }

        private boolean existingHundredSerialNumber(int serialNumber)
        {
            boolean existingSerialNumber = false;
            for(HundredDollar hundredDollar:listHundredDollar)
            {
                if(hundredDollar.getSerialNumber() == serialNumber)
                {
                    existingSerialNumber = true;
                }
            }
            return existingSerialNumber;
        }

        public int hundredListCount(List<HundredDollar>listHundredDollar)
        {
            return listHundredDollar.size();
        }
}
