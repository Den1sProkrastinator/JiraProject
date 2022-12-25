package core;

import com.sun.org.slf4j.internal.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import models.Customer;


import java.util.List;

public class DataForTestsService {
    Logger logger =  LoggerFactory.getLogger(DataForTestsService.class);
    DBService dbService;

    public DataForTestsService(DBService dbService) {
        this.dbService=dbService;
    }

    public void addCustomer(Customer customer) {
        logger.info("Добавляем запись в таблицу");

        String insertToTableSQL
    }

    public void updateCustomer(Customer customer) {
    }

    public void deleteCustomer(Customer customer) {
    }

    public List<Customer> findAll() {

    }

    public Customer findBy(int id) {

    }
}

