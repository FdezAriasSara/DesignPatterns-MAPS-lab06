package model;

import google.maps.GPS;
import google.maps.MapElement;

public class Monument implements Model
{
	private String name;
	private String author;
	private String address;
	private GPS gps=new GPS();

	public Monument(String name, String author, String address) 
	{
		this.name = name;
		this.author = author;
		this.address = address;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}

	@Override
	public MapElement convertToMapElement() {
		Coordinates coordinates=gps.getCoordinates(address);
		MyMapElement equivalent=new MyMapElement(name,  address)
		return ;
	}
}
