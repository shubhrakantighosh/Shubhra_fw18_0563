public class CheckWeather {
    void WeatherReport(Boolean isSnowing,Boolean isRaining,double temperature){
        if(isSnowing==true||isRaining==true||temperature>=50){
            System.out.println("Let’s stay home.");
        }
        else if(isSnowing==false & isRaining==false & temperature<50){
            System.out.println("Let’s go out!");
        }
    }
    public static void main(String[] args) {
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;
        CheckWeather reportWeather=new CheckWeather();
        reportWeather.WeatherReport(isSnowing,isRaining,temperature);
    }
}