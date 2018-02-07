package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static String FILE_PATH = "res/customers.json";
    private static final double OFFICE_LATITUDE = Math.toRadians(53.3381985);
    private static final double OFFICE_LONGITUDE = Math.toRadians(-6.2592576);
    private static final double R = 6371000; //meters
    private static final double PERIMETER = 100000.00; //meters

    public static void main(String[] args) {


       //read the file from .json
        List<Customer> customers = readJsonFile();
        showLines(customers);
    }
    private static List<Customer> calculateNearCustomers(List<Customer> customers, double r) {
        List<Customer> filter = new ArrayList<Customer>();

        for(Customer customer : customers){
			// here should  calculate dictance 
            );


            if(distance <= PERIMETER){
                filter.add(customer);
            }
        }


        return filter;
    }

	//create a list of customers from .json file
    public static List<Customer> readJsonFile(){
        try {
            FileReader reader = new FileReader(FILE_PATH);
            ObjectMapper mapper = new ObjectMapper();

            try {
                return mapper.readValue(reader, mapper.getTypeFactory().constructCollectionType(
                        List.class, Customer.class));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return new ArrayList<Customer>();
    }

	//show Customers next to the office 
    private static void showLines(List<Customer> customers){
        Collections.sort(customers, new CustomerComparator());
        System.out.println("Customers next to the office :");
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }

}
