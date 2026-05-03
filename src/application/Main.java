package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      /*  SellerDao sd = DaoFactory.createSellerDao();

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

        System.out.println("\n===== TEST 6: seller delete====\n");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        sd.deleteById(id);
        System.out.println("Delete completed");

        sc.close();*/

        DepartmentDao obj = DaoFactory.createDepartmentDao();

        System.out.println("==== Insert test ====");
        Department dp = new Department(null, "Food");
        //obj.insert(dp);
        System.out.println("insertion was a success!");

        System.out.println("==== Update test ====");
        //Department dp2 = obj.findById(4);
        //dp2.setName("Monkey");
        //obj.update(dp2);
        System.out.println("Update was a success!");

        System.out.println("==== Delete test ====");
        //obj.deleteById(7);
        System.out.println("Item deleted!");

        System.out.println("==== FindById test ====");
        Department dp3 = obj.findById(3);
        System.out.println(dp3);
        System.out.println("Search was a success!");

        System.out.println("==== FIndAll test ====");
        List<Department> list2 = obj.findAll();
        for (Department department : list2) {
            System.out.println(department);
        }
        System.out.println("Search was a success!");

    }
}