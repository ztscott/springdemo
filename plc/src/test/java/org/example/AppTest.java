package org.example;

import static org.junit.Assert.assertTrue;
import com.github.s7connector.api.DaveArea;
import com.github.s7connector.api.S7Connector;
import com.github.s7connector.api.S7Serializer;
import com.github.s7connector.api.factory.S7ConnectorFactory;
import com.github.s7connector.api.factory.S7SerializerFactory;
import com.github.s7connector.impl.serializer.converter.StringConverter;
import com.github.s7connector.impl.utils.S7Type;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.junit.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public  void test() {
        //创建一个链接对象
        S7Connector connector =
                S7ConnectorFactory
                        .buildTCPConnector()
                        .withHost("192.168.1.104") //
                        .withRack(0) //架机号  可选
                        .withSlot(1) //插槽号  可选
                        .build();
//        String data = "test";
//        byte[] bytes = data.getBytes();
//        System.out.println("bytes = " + bytes.length);
//        connector.write(DaveArea.DB,1,260,bytes);

        byte[] PlcData = connector.read(
                DaveArea.DB, //选择区块
                1, // 区块编号
                255,  //长度
                4);   //偏移地址
        String str = new String(PlcData);
        String str1 = "";
        System.out.println("读取到的数据="+str);
        StringConverter converter = new StringConverter();
        String extract1 = converter.extract(str1.getClass(), PlcData, 0, 0);
        System.out.println("内置方法转换str="+extract1);
    }

}
