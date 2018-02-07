package com.company;

import java.util.Comparator;

public class CustomerComp implements Comparator<Customer> {
	//order by user id (ascending).
    @Override
    public int compare(Customer o1, Customer o2) {
        return (o1.getUser_id() < o2.getUser_id()) ? -1 : 1;
    }
}
