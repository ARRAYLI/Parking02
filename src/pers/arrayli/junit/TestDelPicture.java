package pers.arrayli.junit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestDelPicture {

	@Test
	public void test() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("zhangsan",18);
		map.put("����",20);
		map.put("����",19);
		
		System.out.println(map.get("zhangsan"));
		System.out.println(map.get("����"));
		System.out.println(map.get("����"));
		
	}

}
 