package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Libraries");

        Seller seller = new Seller(7, "Livy", "livy@gmail.com",
                new Date(), 4000.0, obj);

        System.out.println(seller);
    }
}