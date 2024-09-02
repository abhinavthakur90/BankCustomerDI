package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable
{
    private String custName;
    private String custAddrs;
    private Float pAmt;
    private Float time;
    private Float rate;

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAddrs(String custAddrs) {
        this.custAddrs = custAddrs;
    }

    public void setpAmt(Float pAmt) {
        this.pAmt = pAmt;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustAddrs() {
        return custAddrs;
    }

    public Float getpAmt() {
        return pAmt;
    }

    public Float getTime() {
        return time;
    }

    public Float getRate() {
        return rate;
    }
    @Override
    public String toString() {
        return "CustomerDTO{" +
                "custName='" + custName + '\'' +
                ", custAddrs='" + custAddrs + '\'' +
                ", pAmt=" + pAmt +
                ", time=" + time +
                ", rate=" + rate +
                '}';
    }
}
