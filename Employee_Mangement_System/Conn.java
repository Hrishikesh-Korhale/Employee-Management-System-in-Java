package Employee_Mangement_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
    public class Conn {
        Connection c;
        static Statement s;
        Conn(){
            try{
                c = DriverManager.getConnection("jdbc:mysql:///employeemanagment","root","Hrishi@2002");
                s = c.createStatement();
            }catch (Exception e){
                System.out.println(e);
            };

        }
    }