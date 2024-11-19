package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		return "i am calling from jio";

	}

}
