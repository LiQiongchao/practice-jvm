package com.chaocode.jvm.atguigu.jvm3.chapter03.memoryleak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 资源使用后要及时关闭
 * @Author: LiQiongchao
 * @Date: 2021/4/24 8:50
 */
public class CloseResource {
    public static void main(String[] args) {
        try {
            Connection conn = null;
            Class.forName(" com . mysql . jdbc . Driver ");
            conn = DriverManager.getConnection("url", "", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(" . . . ");
        } catch (Exception e) {//异常日志
        } finally {
            //1.关闭结果集 Statement
            //2.关闭声明的对象Resultset
            //3.关闭连接Connection
        }
    }
}
