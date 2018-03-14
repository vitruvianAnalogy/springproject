package com.nishant.spring;

public class TriangleWithAutowiring {
	private Point pointX;
	private Point pointY;
	private Point pointZ;
	
	public void draw(){
		System.out.println("Point A = (" + getPointX().getX() + "," + getPointX().getY() + ")");
		System.out.println("Point B = (" + getPointY().getX() + "," + getPointY().getY() + ")");
		System.out.println("Point C = (" + getPointZ().getX() + "," + getPointZ().getY() + ")");
	}

	public Point getPointX() {
		return pointX;
	}

	public void setPointX(Point pointX) {
		this.pointX = pointX;
	}

	public Point getPointY() {
		return pointY;
	}

	public void setPointY(Point pointY) {
		this.pointY = pointY;
	}

	public Point getPointZ() {
		return pointZ;
	}

	public void setPointZ(Point pointZ) {
		this.pointZ = pointZ;
	}
}
