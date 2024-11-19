package com.entity;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		return "I am calling from airtel";

	}

}
