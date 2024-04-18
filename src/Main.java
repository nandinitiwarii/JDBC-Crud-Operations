import javax.swing.plaf.nimbus.State;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.*;

public class Main {
    private static final String url="jdbc:mysql://localhost:3306/nandinitiwari";
    private static final String username="root";
    private static final  String password="iamsupper@18";

    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());

        }
        /*try{
            Connection connection= DriverManager.getConnection(url,username,password);

            //Read operation of CRUD
            String query="select * from emp";
            Statement statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);
                   while (resultSet.next()) {
                       String empname=resultSet.getString("empname");

                       int empid=resultSet.getInt("empid");
                       System.out.println(empid+" " + empname);
                   }
        } */

        /*try{

            Connection connection= DriverManager.getConnection(url,username,password);
            //Create Operation of CRUD
            String query= " insert into emp(empid,empname)values(3,\"Kartikaya\")";
            Statement statement=connection.createStatement();
            int rowsAffected= statement.executeUpdate(query);
            System.out.println(rowsAffected);



        }*/

        /*try{

            //Update operation of CRUD

            Connection connection=DriverManager.getConnection(url,username,password);
            String query=String.format("update emp set empname=? where empid=?");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"Nandini");
            preparedStatement.setInt(2,3);
            int rowsAffected=preparedStatement.executeUpdate();
            System.out.println(rowsAffected);



        }*/







        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            String query="Delete from emp where empname=?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,"Nandini");
            int rowsAffected=preparedStatement.executeUpdate();
            System.out.println(rowsAffected);


        }

        catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
