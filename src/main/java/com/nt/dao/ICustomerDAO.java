package com.nt.dao;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO
{
    int insert(CustomerBO bo) throws Exception;
}
