import java.sql.*;  
class Database{  
public static void main(String args[]){  
try{  
////step1 load the driver class  //not necessary now
//Class.forName("com.mysql.jdbc.Driver");  
  
//step2 create  the connection object  
Connection connection=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/opd","root","");  
  
//step3 create the statement object  
Statement stmt=connection.createStatement();  
  
//step4 execute query  
stmt.executeUpdate("insert into receptionist values('5','admin@gmail.com','admin')");
ResultSet rs=stmt.executeQuery("select * from receptionist");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
//step5 close the connection object  
connection.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}
