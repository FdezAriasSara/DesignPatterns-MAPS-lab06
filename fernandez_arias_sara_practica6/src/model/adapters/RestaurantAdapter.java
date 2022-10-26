package model.adapters;

import google.maps.Coordinates;
import google.maps.GPS;
import google.maps.MapElement;
import model.Restaurant;

public class RestaurantAdapter implements MapElement {
	private Restaurant restaurant;
	private GPS gps=new GPS();
	public RestaurantAdapter(Restaurant restaurant) {
		this.restaurant=restaurant;
	}
	@Override
	public String getTitle() {
		
		return restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return gps.getCoordinates(restaurant.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		
		return String.format("%s \n %s \n %s",restaurant.getName(), restaurant.getAddress(),restaurant.getPhone());
	}

	@Override
	public void open() {
		restaurant.call();

	}

}
