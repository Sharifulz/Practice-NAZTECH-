package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aemployee {
	int id;
	String ename;
	int sal;
	
	public static List<Aemployee> sendD(){
		Aemployee aa = new Aemployee(1,"Shaarif",25000);
		Aemployee ab = new Aemployee(2,"Aarif",35000);
		Aemployee ac = new Aemployee(3,"Rayhan",45000);
		
		List<Aemployee> list = Arrays.asList(aa,ab,ac);
		return list;
	}
}
