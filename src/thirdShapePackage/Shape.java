// This Shape class is part of 8th program for Circle,Square and Triangle.
// Package name: thirdShapePackage
// imports all the classes and thier methods from firstShapePackage 

package thirdShapePackage;

import firstShapePackage.*;

public class Shape extends firstShapePackage.Shape {
		
	// Imported calculateArea method from Shape class in firstShapePackage and overridden it in this package, by creating object 
	// for shape class in firstShapePackage and calling calculateArea method for that object

	@ Override
	
	public void calculateArea() {
		
		firstShapePackage.Shape shapeObjFromShapePackage = new firstShapePackage.Shape();
		
		shapeObjFromShapePackage.calculateArea();
	}

	// Creating super class method draw in this Shape class which is overridden in the sub classes
	
	public void draw() {
		
	}
}
