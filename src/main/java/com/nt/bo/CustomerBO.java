package com.nt.bo;
public class CustomerBO
{
    private String custName;
    private String custAddrs;
    private Float pAmt;
    private Float time;
    private Float rate;
    private Float intrestAmount;

    public void setCustName(String custName)
    {
        this.custName=custName;
    }
    public String getCustName()
    {
        return custName;
    }
    public void setCustAddrs(String custAddrs)
    {
        this.custAddrs=custAddrs;
    }
    public String getCustAddrs()
    {
        return custAddrs;
    }
    public void setpAmt(Float pAmt)
    {
        this.pAmt=pAmt;
    }
    public Float getpAmt()
    {
        return pAmt;
    }
    public void setTime(Float time)
    {
        this.time=time;
    }
    public Float getTime()
    {
        return time;
    }
    public void setRate(Float rate)
    {
        this.rate=rate;
    }
    public Float getRate()
    {
        return rate;
    }
    public void setIntrestAmount(Float intrestAmount)
    {
        this.intrestAmount=intrestAmount;
    }
    public Float getIntrestAmount()
    {
        return intrestAmount;
    }

    @Override
    public String toString()
    {
        return "CustomerBO{" +
                ", custName='" + custName + '\'' +
                ", custAddrs='" + custAddrs + '\'' +
                ", pAmt=" + pAmt +
                ", time=" + time +
                ", rate=" + rate +
                ", intrestAmount=" + intrestAmount +
                '}';
    }
}
