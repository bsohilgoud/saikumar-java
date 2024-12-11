public class Address {
    private int pincode;
    private String area;
    private String country;
    private String state;
    private int password;

    public Address(int pincode, String area,String country, String state, int password) {
        this.pincode = pincode;
        this.area = area;
        this.country = country;
        this.state = state;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return area + "_" + pincode;
    }
}
