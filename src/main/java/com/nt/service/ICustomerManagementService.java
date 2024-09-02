package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerManagementService
{
    String calculateSimpleIntrest(CustomerDTO dto)  throws Exception;
}
