package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
@Scope("prototype")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${nome}")
	private String nomePropertie;
	
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName(nomePropertie);
		customer.setLastName("Carvalho");
		
		customers.add(customer);
		
		return customers;
	}
}
