package com.crudapp.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
	private int houseNumber;
	private String street;
	private String city;
}
