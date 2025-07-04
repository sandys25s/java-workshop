package com.vetias.java.workshop.temp.bin;

public class Location {
        private string name;
        private double longtitude;
        private double altitude;
        private String country;
        private String city;
        private String adress;
        private String postalcode;
    
        public string getName() {
            return name;
        }
        public void setName(string name) {
            this.name = name;
        }
        public double getLongtitude() {
            return longtitude;
        }
        public void setLongtitude(double longtitude) {
            this.longtitude = longtitude;
        }
        public double getAltitude() {
            return altitude;
        }
        public void setAltitude(double altitude) {
            this.altitude = altitude;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getAdress() {
            return adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }
        public String getPostalcode() {
            return postalcode;
        }
        public void setPostalcode(String postalcode) {
            this.postalcode = postalcode;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "name='" + name + '\'' +
                    ", longtitude=" + longtitude +
                    ", altitude=" + altitude +
                    ", country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", adress='" + adress + '\'' +
                    ", postalcode='" + postalcode + '\'' +
                    '}';
        }
    }