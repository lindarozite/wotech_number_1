// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        
        int temperature = 25;
        
        if(temperature <= 5){
            System.out.println("Super warm clothes needed");
        }
        else if(temperature >= 5 && temperature <=15){
            System.out.println("Regular warm clothes needed");
        }
        else if(temperature > 15 && temperature <=30){
            System.out.println("Normal clothes needed");
        }
        else if(temperature > 30){
            System.out.println("No clothes needed");
        }
        else{
            System.out.println("Error");
        }
        
        
        String season = "sgagh";
        if (season.equals("winter")) {
        System.out.println("Wear a warm jacket!");
        }
        else if (season.equals("spring")) {
        System.out.println("Wear a T-shirt!");
        }
        else if (season.equals("summer")) {
        System.out.println("Wear a swimming suite!");
        }
        else if (season.equals("autumn")) {
        System.out.println("Wear a rain coat!");
        }
        else{
            System.out.println("Invalid season");
        }
    }
}
