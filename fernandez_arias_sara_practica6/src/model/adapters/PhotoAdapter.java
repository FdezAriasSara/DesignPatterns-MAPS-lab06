package model.adapters;

import google.maps.Coordinates;
import google.maps.MapElement;
import model.Photo;

public class PhotoAdapter implements MapElement {
	private Photo photo;
	
	public PhotoAdapter(Photo photo) {
		this.photo=photo;
		
	}
	@Override
	public String getTitle() {
		
		return photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return photo.getCoordinates();
	}

	@Override
	public String getHTMLInfo() {
		
		return String.format("%s (foto de %s)",photo.getDescription(), photo.getUser());
	}

	@Override
	public void open() {
		photo.show();

	}

}
