package model.adapters;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Monument;

public class MonumentAdapter implements MapElement {
	private Monument monument;
	private GPS gps=new GPS();
	public MonumentAdapter(Monument monument){
		this.monument=monument;
	}
	@Override
	public String getTitle() {
		

		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		
		return gps.getCoordinates(monument.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return String.format("%s. Created by %s. %s", monument.getName(),monument.getAuthor(), monument.getAddress());
	}

	@Override
	public void open() {
		gps.getDirectionsTo(monument.getAddress());

	}

}
