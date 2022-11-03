package form;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Monument;
import model.Photo;
import model.Restaurant;

/* 
 * Formulario básico para usar cuando se quieran pedir sólo dos valores sobre algo.
 */
public class Form {

	public void edit(Monument monument) 
	{
		System.out.println("Editando el monumento...");

		System.out.println("Valores actuales:");
		printMonument(monument);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Autor: ");
		String value = readLine();
		if (value.length() > 0)
			monument.setAuthor(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			monument.setAddress(value);

		System.out.println("Valores finales:");
		printMonument(monument);
	}
	private void printMonument(Monument monument) 
	{
		System.out.println(" - Autor: " + monument.getAuthor());
		System.out.println(" - Dirección: " + monument.getAddress());
	}
	public void edit(Restaurant restaurant) 
	{
		System.out.println("Editando el restaurante...");

		System.out.println("Valores actuales:");
		printRestaurant(restaurant);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Nombre: ");
		String value = readLine();
		if (value.length() > 0)
			restaurant.setName(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			restaurant.setAddress(value);

		System.out.println("Valores finales:");
		printRestaurant(restaurant);
	}

	
	private void printRestaurant(Restaurant restaurant) 
	{
		System.out.println(" - Autor: " + restaurant.getName());
		System.out.println(" - Dirección: " + restaurant.getAddress());
	}
	public void edit(Photo  photo) 
	{
		System.out.println("Editando el restaurante...");

		System.out.println("Valores actuales:");
		printPhoto(photo);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print(" - Nombre: ");
		String value = readLine();
		if (value.length() > 0)
			photo.setUser(value);

		System.out.print(" - Dirección: ");
		value = readLine();
		if (value.length() > 0)
			photo.setDescription(value);

		System.out.println("Valores finales:");
		printPhoto(photo);
	}

	
	private void printPhoto(Photo photo) 
	{
		System.out.println(" - User: " + photo.getUser());
		System.out.println(" - Description " + photo.getDescription());
	}
	private String readLine() 
	{
		do {
			try {
				return console.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura: inténtelo de nuevo");
			}
		} while (true);
	}

	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
}
