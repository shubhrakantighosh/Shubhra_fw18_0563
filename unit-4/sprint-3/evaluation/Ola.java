public class Ola extends Car{
    public int bookCar(int numberOfPassenger, int numberOfKMs){
        if(numberOfPassenger<=3){
            HatchBack hatchBack=new HatchBack();
            return hatchBack.farePerKm*numberOfKMs;
        }
        else {
            Sedan sedan=new Sedan();
            return sedan.farePerKm*numberOfKMs;
        }
    }
    public int calculateBill(int car){
        return car;
    }
}
