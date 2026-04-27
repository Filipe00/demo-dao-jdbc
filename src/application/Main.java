package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
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

        System.out.println("\n===== TEST 4: seller insert====\n");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",
                new Date(), 4000.0, departmentTest);
        sd.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===== TEST 5: seller update====\n");
        seller = sd.findById(1);
        seller.setName("Martha Wayne");
        sd.update(seller);
        System.out.println("Update completed!");
    }
}