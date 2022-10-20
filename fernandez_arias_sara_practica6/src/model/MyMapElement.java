package model;

import google.maps.Coordinates;
import google.maps.MapElement;

public class MyMapElement implements MapElement {
	private String title;
	private Coordinates  coordinates;
	private String HTMLinfo;
	public MyMapElement(String title,Coordinates coordinates,String HTMLinfo) {
		
	}
	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public Coordinates getCoordinates() {
		
		return coordinates;
	}

	@Override
	public String getHTMLInfo() {
		
		return HTMLinfo;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

}
