package com.nt.dao;
import com.nt.bo.CustomerBO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerMySqlDAOImpl implements ICustomerDAO
{
    private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER(CUSTNAME,CUSTADDRS,PAMT,TIME,RATE,INTRESTAMOUNT) VALUES(?,?,?,?,?,?)";
    private final DataSource ds;
    @Override
    public int insert(CustomerBO bo) throws Exception
    {
        int result = 0;
        try(Connection con = ds.getConnection();
            PreparedStatement ps = con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY))
        {
            ps.setString(1, bo.getCustName());
            ps.setString(2, bo.getCustAddrs());
            ps.setFloat(3, bo.getpAmt());
            ps.setFloat(4, bo.getTime());
            ps.setFloat(5, bo.getRate());
            ps.setFloat(6, bo.getIntrestAmount());
            result = ps.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }
    public CustomerMySqlDAOImpl(DataSource ds) {
        System.out.println("CustomerMySqlDAOImpl:::1-param Constructor");
        this.ds = ds;
    }
}
