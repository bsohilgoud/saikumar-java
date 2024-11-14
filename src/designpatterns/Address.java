package designpatterns;

public class Address {

    private int pincode;
    private String area;
    private String landmark;
    private String country;
    private String state;

    public Address(int o1, String o2, String o3, String o4, String o5) {
        this.pincode = o1;
        this.area = o2;
        this.country = o3;
        this.state = o4;
        this.landmark = o5;
    }

    public void sayhello(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Address{" +
                "pincode=" + pincode +
                ", area='" + area + '\'' +
                ", landmark='" + landmark + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }


    public static class AddressBuilder {
        private int pincode;
        private String area;
        private String landmark;
        private String country;
        private String state;

        public AddressBuilder setArea(String area) {
            this.area = area;
            return this;
        }

        public AddressBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressBuilder setLandmark(String landmark) {
            this.landmark = landmark;
            return this;
        }

        public AddressBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder setPincode(int pincode) {
            this.pincode = pincode;
            return this;
        }

        public Address build(){
            return new Address(this.pincode, this.area, this.country, this.state, this.landmark);
        }
    }
}
