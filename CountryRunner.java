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
 