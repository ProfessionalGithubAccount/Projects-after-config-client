package com.iiht.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private String name;
	private String gender;

	/*
	 * public Member() { super(); // TODO Auto-generated constructor stub } public
	 * Member(String name, String gender) { super(); this.name = name; this.gender =
	 * gender; }
	 * 
	 * @Override public String toString() { return "Member [name=" + name +
	 * ", gender=" + gender + "]"; } private String name; private String gender;
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public String getGender() { return gender; } public void
	 * setGender(String gender) { this.gender = gender; }
	 */
}
