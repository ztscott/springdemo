package com.example;

import com.example.Dao.PlcDao;
import com.example.entity.PLC;
import com.github.s7connector.api.DaveArea;
import com.github.s7connector.api.S7Connector;
import com.github.s7connector.api.factory.S7ConnectorFactory;

import java.io.IOException;

public class Test
{


    public static void main( String[] args ) throws IOException {

        boolean swi ;
        //创建一个链接对象
        S7Connector connector =
                S7ConnectorFactory
                        .buildTCPConnector()
                        .withHost("192.168.1.112") //
                        .withRack(0) //机架号  可选
                        .withSlot(1) //插槽号  可选
                        .build();

        String data1 = "ABC";
        String data2 = "OPQ";
        byte[] bytes1 = data1.getBytes();
        byte[] bytes2 = data2.getBytes();
        byte[] bool = {1,0};
        byte[] intdata = {1,2};
//        byte[] string = {-2,3,112,113,120};
//
//        connector.write(DaveArea.DB,1,0,bool);  //区块编号和偏移地址
//        connector.write(DaveArea.DB,1,2,intdata);  //区块编号和偏移地址
//        connector.write(DaveArea.DB,1,6,bytes1);  //区块编号和偏移地址
//        connector.write(DaveArea.DB,1,262,bytes2);  //区块编号和偏移地址


//布尔类型数据
        byte[] PlcDataBool = connector.read(
                DaveArea.DB, //选择区块
                1, // 区块编号
                2,  //长度
                0);   //偏移地址
        if(PlcDataBool[0] == 1){
            swi = true;
            System.out.println("读到的布尔类型数据=TRUE");
        }else{
            swi = false;
            System.out.println("读到的布尔类型数据=FALSE");
        }



//整数类型数据
        byte[] PlcDataInt = connector.read(
                DaveArea.DB, //选择区块
                1, // 区块编号
                2,  //长度
                2);   //偏移地址
        System.out.println("读取到的整数数据=" + (PlcDataInt[0]*256+PlcDataInt[1]));


//字符串类型数据
        byte[] PlcDataString1 = connector.read(
                DaveArea.DB, //选择区块
                1, // 区块编号
                254,  //长度
                6);   //偏移地址


        byte[] PlcDataString2 = connector.read(
                DaveArea.DB, //选择区块
                1, // 区块编号
                254,  //长度
                262);   //偏移地址


        String str1 = new String(PlcDataString1);
        String str2 = new String(PlcDataString2);
//        String str1 = "";
        System.out.println("读取到的第一个字符数据=" + str1);
        System.out.println("读取到的第二个字符数据=" + str2);
//        StringConverter converter = new StringConverter();
//        String extract1 = converter.extract(str1.getClass(), PlcDataString, 0, 0);
//        System.out.println("内置方法转换后的数据="+extract1);

          //存入mysql数据库
//        PLC plc = new PLC(swi,PlcDataInt[0]*256+PlcDataInt[1] , str1, str2);
//        PlcDao plcDao = new PlcDao();
//        plcDao.add(plc);

        connector.close();

    }

}


