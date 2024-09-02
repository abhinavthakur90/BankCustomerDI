package com.nt.ClientApplication;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Scanner;

public class ClientApplication
{
    public static void main(String[] args)
    {
        CustomerVO vo = new CustomerVO();
        String custName;
        String custAddrs;
        String pAmt;
        String time;
        String rate;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter Customer Name:- ");
        custName= scanf.nextLine();
        System.out.println("Enter Customer Address:- ");
        custAddrs=scanf.nextLine();
        System.out.println("Enter Customer Principal Amount:- ");
        pAmt=scanf.nextLine();
        System.out.println("Enter Time in months:- ");
        time=scanf.nextLine();
        System.out.println("Enter rate of intrest:- ");
        rate = scanf.nextLine();
        vo.setCustName(custName);
        vo.setCustAddrs(custAddrs);
        vo.setpAmt(pAmt);
        vo.setRate(rate);
        vo.setTime(time);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("applicationContext.xml");
        MainController controller = factory.getBean("controller", MainController.class);
        try
        {
            String result = controller.processCustomer(vo);
            System.out.println(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Internal Problem---->Try Again");
        }
    }
}
