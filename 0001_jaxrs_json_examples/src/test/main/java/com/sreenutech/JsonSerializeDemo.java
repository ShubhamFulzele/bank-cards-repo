package com.sreenutech;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializeDemo {

	public static void main(String[] args) throws JsonProcessingException {
		
		Customer customer = new Customer();
		Account account = new Account();
		account.setAccountNum("087655443345678");
		account.setBalance(10000);
		account.setBankName("CITI");
		customer.setAccount(account);
		List<String> address = new ArrayList<String>();
		address.add("s.r.nagar");
		address.add("Hitech city");
		customer.setAddress(address);
		customer.setCustid(11111);
		customer.setDob("24-08-2010");
		customer.setFname("sreenu");
		customer.setLname("tech");
		customer.setMob(89358439999l);
		List<Order> orderList = new ArrayList<Order>();
		Order order = new Order();
		order.setOrderId("1234");
		order.setName("mobile");
		order.setDesc("good");
		Order order1 = new Order();
		order1.setOrderId("1234");
		order1.setName("mobile");
		order1.setDesc("good");
		orderList.add(order1);
		Order order2 = new Order();
		order2.setOrderId("1234");
		order2.setName("mobile");
		order2.setDesc("good");
		orderList.add(order2);
		customer.setOrder(orderList);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);
		System.out.println(json);

	}

}
