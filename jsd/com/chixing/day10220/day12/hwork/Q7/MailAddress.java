package chixing.day10220.day12.hwork.Q7;

public class MailAddress {
    private String name;
    private String  telno;
    private String street;
    private String  city;
    private String state;
    private String country;
    private String  pincode;

    public MailAddress(String name, String telno, String street, String city, String state, String country, String pincode) {
        this.name = name;
        this.telno = telno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "MailAddress{" +
                "name='" + name + '\'' +
                ", telno='" + telno + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
