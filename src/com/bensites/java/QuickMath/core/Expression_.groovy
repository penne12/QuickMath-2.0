package com.bensites.java.QuickMath.core

class Expression_ {
	
	def contains = []
	
	private Expression_(Expression_ ex1, Operator operator, Expression_ ex2) {
		contains = [ex1, operator, ex2]
	}
	private Expression_(Double d1, Operator operator, Double d2) {
		contains = [operator.doOperation(d1, d2)]
	}
	public compress() {
		
	}
	def isNumber() {
		try {
			contains[1]
		} catch(e) {
			println e
		}
		false
	}
}
