package com.bensites.java.QuickMath.core;

import java.util.ArrayList;

class Operator{
	Operator(String operator, int ArgumentsNeeded){
		this.operator = operator;
		argumentsNeeded = ArgumentsNeeded;
		QuickMath.registry.register(this);
		
	}
	final def argumentsNeeded;
	def operator;
	
	/**
	 * Does the operation - defaults to running with doOperation with just supplying a the 0th and 2nd number as doubles.
	 * @param Arguments of operation (should be formed like "x operator x")
	 * @return Value when returned.
	 */
	public double doOperation(ArrayList<String> args) {
		doOperation(Double.valueOf(args.get(0)),Double.valueOf(args.get(2)));
	};
	
	double doOperation(double left, double right) throws ClassFormatError{
		throw(new java.lang.ClassFormatError("This operator ("+ this.getOperator +") is broken"));
	}
}
