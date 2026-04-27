package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sd = DaoFactory.createSellerDao();

        System.out.println("===== TEST 1: seller findById====\n");
        Seller seller = sd.findById(3);
        System.out.println(seller);

        System.out.println("\n===== TEST 2: seller findByDepartment====\n");
        Department departmentTest = new Department(2, null);
        List<Seller> list = sd.findByDepartment(departmentTest);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n===== TEST 3: seller findAll====\n");
        list = sd.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}