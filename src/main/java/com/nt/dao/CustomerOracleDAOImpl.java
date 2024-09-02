package com.nt.dao;

import com.nt.bo.CustomerBO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class CustomerOracleDAOImpl implements ICustomerDAO
{
    private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY="INSERT INTO REAL_TIMEDI_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)";
    private final DataSource ds;
    @Override
    public int insert(CustomerBO bo) throws Exception
    {
        Connection con=null;
        PreparedStatement ps=null;
        int result=0;
        try
        {
            con= ds.getConnection();
            ps = con.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY);
            ps.setString(1, bo.getCustName());
            ps.setString(2,bo.getCustAddrs());
            ps.setFloat(3,bo.getpAmt());
            ps.setFloat(4,bo.getTime());
            ps.setFloat(5,bo.getRate());
            ps.setFloat(6,bo.getIntrestAmount());
            result=ps.executeUpdate();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        finally
        {
            try
            {
                if(ps!= null) {
                    ps.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
                throw se;
            }
            try
            {
                if(con!=null)
                {
                    con.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
                throw se;
            }
        }
        return result;
    }
    public CustomerOracleDAOImpl(DataSource ds)
    {
        System.out.println("CustomerOracleDAOImpl:::1-param Constructor");
        this.ds = ds;
    }
}
