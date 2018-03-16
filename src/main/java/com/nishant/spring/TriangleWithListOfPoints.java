package com.nishant.spring;

import java.util.List;

public class TriangleWithListOfPoints implements Shape {
		private List<Point> listOfPoints;

		public List<Point> getListOfPoints() {
			return listOfPoints;
		}

		public void setListOfPoints(List<Point> listOfPoints) {
			this.listOfPoints = listOfPoints;
		}
		
		public void draw(){
			for(Point p : listOfPoints){
				System.out.println("Point = (" + p.getX() + "," + p.getY() + ")");
			}
		}
}
