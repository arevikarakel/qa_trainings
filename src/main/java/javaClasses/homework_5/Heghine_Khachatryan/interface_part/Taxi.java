package javaClasses.homework_5.Heghine_Khachatryan.interface_part;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Taxi implements Bookable, Stoppable {

    private String transportName;
    private Address address;

    public Taxi() {

    }

    public Taxi(String transportName, Address address) {
        this.transportName = transportName;
        this.address = address;
    }

    @Override
    public String bookTicket() {
        String str = "N" + address.getHomeNumber() + ", " + address.getStreet() + " ," + address.getCity()
                + " ," + address.getRegion();
        String regex = "^[N.0-9a-zA-Z\\s,]+$";
        // valid address will be N homeNumber, Street, City, Region
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            return "Address doesn't match the requirements. Please check it";
        } else {
            return "Your booking was made successfully. " + getTransportName() +
                    " will take you to the destination address in 2 hours considering traffic jams on the street";
        }
    }

    @Override
    public String makingStop() {
        return Stoppable.super.makingStop() + " " + getTransportName();
    }

    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address {
        private int homeNumber;
        private String street;
        private String city;
        private String region;

        public Address(int homeNumber, String street, String city, String region) {
            this.homeNumber = homeNumber;
            this.street = street;
            this.city = city;
            this.region = region;
        }

        public int getHomeNumber() {
            return homeNumber;
        }

        public void setHomeNumber(int homeNumber) {
            this.homeNumber = homeNumber;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    }
}
