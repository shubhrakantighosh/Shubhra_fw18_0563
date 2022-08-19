package question1;

public class OLA {

    public Car bookCar(int numberOfPassenger, int numberOfKMs){

        Car car;

        if (numberOfPassenger<=3){

            car=new HatchBack();
            car.setNumberOfKms(numberOfKMs);

        }else{

            car=new Sedan();
            car.setNumberOfKms(numberOfKMs);
        }

        return car;
    }

    public int calculateBill(Car car){

        int total=0;
        if (car instanceof HatchBack){

            total=((HatchBack) car).farePerKm* car.getNumberOfKms();

        }else if(car instanceof Sedan){

            total=((Sedan) car).farePerKm* car.getNumberOfKms();
        }
        return total;
    }

}
