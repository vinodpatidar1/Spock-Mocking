package com.spock.mocking

import spock.lang.Specification

class SpockMockingSpec extends Specification {

	def objSpockMocking = new SpockMocking()

	def 'Get Welcome Message'(){
		expect:'Should return Welcome Message'
		objSpockMocking.getMessage() == "Hello World!!"
	}
}
