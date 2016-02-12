package com.bullhornsdk.data.api;

import static org.junit.Assert.assertFalse

import org.junit.Test

import com.google.common.collect.Sets

public class TestGroovySyntax {

	@Test
	public void regularExpressionTest(){
		
			Set<String> fields = Sets.newHashSet("id", "occupation", "name", "skills[15](id,name)"); 
			Set<String> squareBrackesFilter = fields.collect(){it.replaceAll('\\[\\d+\\]', "")};
			
			assert !squareBrackesFilter.contains("skills[15](id,name)");
		
	}

}
