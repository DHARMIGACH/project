public class ClassRunner {
    public static void main(String[] args) {
        
        Claw claw = new Claw();
        claw.name = "sharpClaw";
        claw.noOfClaws = 5;
        System.out.println("Name of Claw is: " + claw.name);
        System.out.println("No of Claws is: " + claw.noOfClaws);
        System.out.println("Color of Claw is: " + claw.color);

        
        Crow crow = new Crow();
        crow.name = "crowy";
        crow.noOfCrows = 3;
        System.out.println("Name of Crow is: " + crow.name);
        System.out.println("No of Crows is: " + crow.noOfCrows);
        System.out.println("Color of Crow is: " + crow.color);

       
        Clock clock = new Clock();
        clock.name = "wallClock";
        clock.noOfClocks = 2;
        System.out.println("Name of Clock is: " + clock.name);
        System.out.println("No of Clocks is: " + clock.noOfClocks);
        System.out.println("Color of Clock is: " + clock.color);

   
        Lollipop lollipop = new Lollipop();
        lollipop.name = "sweetLollipop";
        lollipop.noOfLollipops = 10;
        System.out.println("Name of Lollipop is: " + lollipop.name);
        System.out.println("No of Lollipops is: " + lollipop.noOfLollipops);
        System.out.println("Color of Lollipop is: " + lollipop.color);

        Jean jean = new Jean();
        jean.name = "denimJean";
        jean.noOfJeans = 7;
        System.out.println("Name of Jean is: " + jean.name);
        System.out.println("No of Jeans is: " + jean.noOfJeans);
        System.out.println("Color of Jean is: " + jean.color);

        
        

        
        Mountain mountain = new Mountain();
        mountain.name = "everest";
        mountain.noOfMountains = 1;
        System.out.println("Name of Mountain is: " + mountain.name);
        System.out.println("No of Mountains is: " + mountain.noOfMountains);
        System.out.println("Color of Mountain is: " + mountain.color);

        
        Stadium stadium = new Stadium();
        stadium.name = "olympicStadium";
        stadium.noOfStadiums = 3;
        System.out.println("Name of Stadium is: " + stadium.name);
        System.out.println("No of Stadiums is: " + stadium.noOfStadiums);
        System.out.println("Color of Stadium is: " + stadium.color);

        // Spray
        Spray spray = new Spray();
        spray.name = "airFreshener";
        spray.noOfSprays = 2;
        System.out.println("Name of Spray is: " + spray.name);
        System.out.println("No of Sprays is: " + spray.noOfSprays);
        System.out.println("Color of Spray is: " + spray.color);
    }
}