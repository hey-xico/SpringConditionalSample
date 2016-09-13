package br.com.chico.conditionalsample.service;

import br.com.chico.conditionalsample.dao.ProductDAO;
import br.com.chico.conditionalsample.domain.Product;

import java.util.Collection;

/**
 * Created by francisco.almeida on 9/12/16.
 */
public class ProductService {
    private ProductDAO employeeDAO;

    public ProductService(ProductDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Collection<Product> getEmployeeDetails() {
        return employeeDAO.getProducts();
    }

}
