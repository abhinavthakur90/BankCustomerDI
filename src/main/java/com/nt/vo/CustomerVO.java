package com.nt.vo;

public class CustomerVO
{
    private String custName;
    private String custAddrs;
    private String pAmt;
    private String time;
    private String rate;

    public String getCustName()
    {
        return custName;
    }

    public String getCustAddrs()
    {
        return custAddrs;
    }

    public String getpAmt()
    {
        return pAmt;
    }

    public String getTime()
    {
        return time;
    }

    public String getRate()
    {
        return rate;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public void setCustAddrs(String custAddrs)
    {
        this.custAddrs = custAddrs;
    }

    public void setpAmt(String pAmt)
    {
        this.pAmt = pAmt;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    @Override
    public String toString()
    {
        return "CustomerVO{" +
                "custName='" + custName + '\'' +
                ", custAddrs='" + custAddrs + '\'' +
                ", pAmt='" + pAmt + '\'' +
                ", time='" + time + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
