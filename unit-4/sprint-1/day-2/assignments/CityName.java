package Day2;

public class CityName {
    public static void main(String[] args) {
        String City="Bangalore";
        CityStatus(City);
    }
    public static void CityStatus(String City){
        switch (City){
            case "Mumbai":
                System.out.println("Financial city");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Delhi":
                System.out.println("Capital of the country");
                break;
            case "Bangalore":
                System.out.println("Cyber City");
                break;
            default:
                System.out.println("May be Other Indian City");
        }
    }
}
