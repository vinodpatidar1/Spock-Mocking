package com.spock.mocking

import mockit.MockUp
import spock.lang.Specification

class SpockMockingSpec extends Specification {

	def objSpockMocking = new SpockMocking()

	MockUp<SpockMocking> mockSpockMocking

	def 'Get Welcome Message'(){
		expect:'Should return Welcome Message'
		objSpockMocking.getMessage() == "Hello World!!"
	}

	void mockSpockMocking(){
		mockSpockMocking = new MockUp<SpockMocking>() {
					@mockit.Mock public String mockMethod(String strValue) {
						return "This is mock result"
					}
				}
	}
	def'API to Test Mocking'(){
		given:'Instance of SpockMocking'
		when :'SpockMocking.mockMethod is called'
		mockSpockMocking()
		then : 'It will return mock result'
		objSpockMocking.mockMethod("Test") == 'This is mock result'
	}
	
	
}
