package question4;

public class Address {

    private String state;
    private String city;
    private int PinCode;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    public Address(String state, String city, int pinCode) {
        this.state = state;
        this.city = city;
        PinCode = pinCode;
    }
}
