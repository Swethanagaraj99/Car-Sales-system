import java.util.*;

public class Manufacturer implements java.io.Serializable
{
	private String manufacturer;		//name of manufacturer
	private Car[] car = new Car[0];		//stores information about all the cars by a manufacturer

	
	public Manufacturer(String nam, Car c)
	{
		manufacturer = nam.toUpperCase();
		addCar(c);
	}

	
	public void addCar(Car c)
	{
		car = resizeArray(car, 1);
		car[car.length - 1] = c;
	}

	
	public int carCount()
	{
		return car.length;
	}

	
	public Car[] getAllCars()
	{
		return car;
	}

	/*public Car getCar(int n)
	{
		Car returnCar;

		try
		{
			returnCar = car[n];
		}
		catch (Exception exp)
		{
			returnCar = null;
		}

		return returnCar;
	}*/

	public String getManufacturerName()
	{
		return manufacturer;
	}

	
	private Car[] resizeArray(Car[] c, int extendBy)
	{
		Car[] result = new Car[c.length + extendBy];

		for (int i = 0; i < c.length; i++)
		{
			result[i] = c[i];
		}

		return result;
	}

	/*public Car[] search(int minPrice, int maxPrice, int minDistance, int maxDistance)
	{
		Vector result = new Vector();
		int price;
		double distance;

		for (int i = 0; i < car.length; i++)
		{
			price = car[i].getPrice();
			distance = car[i].getKilometers();

			if (price >= minPrice && price <= maxPrice)
 				if (distance >= minDistance && distance <= maxDistance)
					result.add(car[i]);
		}

		return CarSalesSystem.vectorToCar(result);
	}*/

	/*public Car[] search(int minAge, int maxAge)
	{
		Vector result = new Vector();

		for (int i = 0; i < car.length; i++)
		{
			if (car[i].getAge() >= minAge && car[i].getAge() <= maxAge)
			{
				result.addElement(car[i]);
			}
		}

		return CarSalesSystem.vectorToCar(result);
	}*/

	public void setManufacturersName(String nam)
	{
		manufacturer = nam.toUpperCase();
	}
}