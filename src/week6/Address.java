package week6;

public class Address {

    String street;
    String city;
    String state;
    int zipcode;
    String country;


    public void setInfo(){

    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }
}
