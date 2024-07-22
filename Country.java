 class Country{
	
	public static String countryCode(String code)
	{
	
		System.out.println("Country code :"+code);
		if(code=="IN")
		{
			return "INDIA";
		}
		else if(code=="US")
		{
			return "UNITED STATES";
		}
		else if(code=="CN")
		{
			return "CHINA";
		}
		else if(code=="JP")
		{
			return "JAPAN";
		}
		else if(code=="DE")
		{
			return "GERMANY";
		}
		
		return "Not Found";
		
	}
	public static double priceByItem(String item)
	{
	
		System.out.println("Item :"+item);
		if(item=="Lomo Saltado")
		{
			return 3546;
		}
		else if(item=="Chocolate")
		{
			return 786;
		}
		else if(item=="Biscuits")
		{
			return 8543;
		}
		else if(item=="Burrito")
		{
			return 3452;
		}
		else if(item=="Cabbage roll")
		{
			return 9087;
		}
		
		return 0;
	}
	public static String movieName(String movie)
	{
	
		System.out.println("Movie Name :"+movie);
		if(movie=="INCEPTION")
		{
			return "EMMA THOMAS";
		}
		else if(movie=="TITANIC")
		{
			return "JAMES CAMERON";
		}
		else if(movie=="THE MATRIX")
		{
			return "JOEL SILVER";
		}
		else if(movie=="AVATAR")
		{
			return "JAMES CAMERON";
		}
		else if(movie=="THE LORD OF THE RINGS")
		{
			return "PETER JACKSON";
		}
		
		return "Not Found";
	}
}
 class CountryRunner{
	
	public static void main(String[] args)
	{
		String concode=Country.countryCode("IN");
		System.out.println("Country : "+concode);
		
		concode=Country.countryCode("US");
		System.out.println("Country : "+concode);
		
		concode=Country.countryCode("CN");
		System.out.println("Country : "+concode);
		
		concode=Country.countryCode("JP");
		System.out.println("Country : "+concode);
		
		concode=Country.countryCode("DE");
		System.out.println("Country : "+concode);
		
		concode=Country.countryCode("OD");
		System.out.println("Not Found :"+concode);
		
		System.out.println("===============================================");
		
		double item=Country.priceByItem("Lomo Saltado");
		System.out.println("Price: "+item);
		
		
		item=Country.priceByItem("Chocolate");
		System.out.println("Price: "+item);
		
		item=Country.priceByItem("Biscuits");
		System.out.println("Price: "+item);
		
		item=Country.priceByItem("Burrito");
		System.out.println("Price: "+item);
		
		item=Country.priceByItem("Cabbage roll");
		System.out.println("Price: "+item);
		
		item=Country.priceByItem("Paneer");
		System.out.println("Not Found"+item);
		
		System.out.println("===============================================");
		
		String movie=Country.movieName("INCEPTION");
		System.out.println("Producer : "+movie);
		
		movie=Country.movieName("TITANIC");
		System.out.println("Producer : "+movie);
		
		movie=Country.movieName("THE MATRIX");
		System.out.println("Producer : "+movie);
		
		movie=Country.movieName("AVATAR");
		System.out.println("Producer : "+movie);
		
		movie=Country.movieName("THE LORD OF THE RINGS");
		System.out.println("Producer : "+movie);
		
		movie=Country.movieName("JUMANJI");
		System.out.println("Not Found :"+movie);
		
	}
}
 