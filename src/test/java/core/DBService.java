package core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class DBService {
    Logger logger = LoggerFactory.getLogger(DBService.class);

    Connection connection = null;
    Statement statement = null;

    public DBService() {
        try {
            Class.forName("org.postgresql.Driver");
        }catch ( ClassNotFoundException e){
            logger.info(e.toString());
            return;
        }
        try {
            connection = DriverManager.getConnection(ReadProperties.jdbc(),ReadProperties.userDB(),ReadProperties.pswDB());
        }catch (SQLException throwables){
            logger.info(throwables.toString());
        }
        if (connection!=null){
            logger.info("You succesfully connected to database");
        } else {
            logger.info("Что-то пошло не так");
        }
    }
    public void closeConnection(){
        try{
            connection.close();
        }catch (SQLException throwables){
            logger.info(throwables.toString());
        }
    }

    public Connection getConnection(){
        return  this.connection;
    }

    public Statement getStatement(){
        try{
            if (statement == null){
                statement = getConnection().createStatement();
            }
        }catch (SQLException ex){
            logger.info("Не удалось создать Statement...");
        }
        return statement;
    }

    public void executeSQL(String sql){
        try {
            logger.info("Рехультат выполнения запроса"+ getStatement().execute(sql));
        } catch (SQLException e) {
            logger.info(e.getMessage());
        }
    }

    public ResultSet executeQuery(String sql){
        try {
            return  getStatement().executeQuery(sql);
        } catch (SQLException ex){
            logger.info(ex.getMessage());
        }
        return null;
    }

}
