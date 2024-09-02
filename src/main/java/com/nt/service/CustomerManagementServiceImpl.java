package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerMySqlDAOImpl;
import com.nt.dao.CustomerOracleDAOImpl;
import com.nt.dto.CustomerDTO;

public final class CustomerManagementServiceImpl implements ICustomerManagementService
{
    CustomerMySqlDAOImpl dao;
    public CustomerManagementServiceImpl(CustomerMySqlDAOImpl dao)
    {
        System.out.println("Service Class::: 1 Arg Constructor");
        this.dao=dao;
    }
    @Override
    public String calculateSimpleIntrest(CustomerDTO dto) throws Exception
    {
        Float intrestAmount=(dto.getpAmt()*dto.getRate()*dto.getTime())/(100.00f*12);
        CustomerBO bo = new CustomerBO();
        bo.setCustName(dto.getCustName());
        bo.setCustAddrs(dto.getCustAddrs());
        bo.setpAmt(dto.getpAmt());
        bo.setRate(dto.getRate());
        bo.setTime(dto.getTime());
        bo.setIntrestAmount(intrestAmount);
        int result=dao.insert(bo);
        return result==1?"Customer Registered Successfully-->Simple Intrest Amount "+intrestAmount:"Customer Registration Failed";
    }
}
