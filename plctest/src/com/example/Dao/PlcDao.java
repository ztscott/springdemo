package com.example.Dao;

import com.example.DBUtil.JdbcUtil;
import com.example.entity.PLC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 2020/4/27
 */
public class PlcDao {

    private JdbcUtil util = new JdbcUtil();
    //用户注册
    //JDBC规范中，Connection创建与销毁最浪费时间
    public int add(PLC plc){
        String sql ="insert into plctest(switch,temperature,str1,str2)" +
                " values(?,?,?,?)";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setBoolean(1, plc.isSwitch1());
            ps.setInt(2, plc.getTem());
            ps.setString(3, plc.getStr1());
            ps.setString(4, plc.getStr2());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }
//    public int add(Sensor sensor, HttpServletRequest request) {
//        int result = 0;
//        if (request.getParameter("email").length() == 9) {
//            String sql = "insert into users(userName,password,sex,email)" +
//                    " values(?,?,?,?)";
//            PreparedStatement ps = util.createStatement(sql, request);
//
//            try {
//                ps.setString(1, user.getUserName());
//                ps.setString(2, user.getPassword());
//                ps.setString(3, user.getSex());
//                ps.setString(4, user.getEmail());
//                result = ps.executeUpdate();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                util.close(request);
//            }
//
//        }
//        return result;
//    }
    //查询所有用户信息
//    public List findAll(){
//        String sql ="select * from user";
//        PreparedStatement ps = util.createStatement(sql);
//        ResultSet rs = null;
//        List sensorList = new ArrayList();
//        try {
//            rs = ps.executeQuery();
//            while(rs.next()){
//                Integer ph = rs.getInt("ph");
//                Integer  tem =rs.getInt("tem");
//                Integer  hum = rs.getInt("hum");
//                Integer  light = rs.getInt("light");
//                Timestamp time = rs.getTimestamp("CreateTime");
//                Sensor sensor = new Sensor(ph, tem, hum, light, time);
//                sensorList.add(sensor);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            util.close(rs);
//        }
//        return sensorList;
//    }


}
