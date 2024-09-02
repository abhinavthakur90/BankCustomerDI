package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerManagementService;
import com.nt.vo.CustomerVO;

public class MainController
{
    private ICustomerManagementService service;

    public MainController(ICustomerManagementService service)
    {
        System.out.println("MainController:::1-Arg Constructor");
        this.service = service;
    }
    public String processCustomer(CustomerVO vo) throws Exception
    {
        CustomerDTO dto = new CustomerDTO();
        dto.setCustName(vo.getCustName());
        dto.setCustAddrs(vo.getCustAddrs());
        dto.setpAmt(Float.parseFloat(vo.getpAmt()));
        dto.setRate(Float.parseFloat(vo.getRate()));
        dto.setTime(Float.parseFloat(vo.getTime()));
        return (service.calculateSimpleIntrest(dto));
    }
}
