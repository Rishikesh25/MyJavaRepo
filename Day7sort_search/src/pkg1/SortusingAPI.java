package pkg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortusingAPI {

	public static void main(String[] args) {
		List<java.lang.String> data = Arrays.asList("BE","ML","SDT");
   
	Collections.sort(data);
	
	for(var i : data)
		System.out.println(i);
	}

}
