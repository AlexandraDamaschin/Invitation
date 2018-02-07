package com.company;

// create  clas with variables needed for .json file
public class Customer {
        private int user_id;
        private String name;
        private double latitude;
        private double longitude;
		
		//get and set longitude
        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = Double.parseDouble(longitude);
        }
//get and set latitude
        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = Double.parseDouble(latitude);
        }

		//get and set name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

		//get and set user_id
        public long getUser_id() {
            return user_id;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }
		
        @Override
        public String toString() {
            String separator = " - ";
            StringBuilder builder = new StringBuilder();
            builder.append("Id: " + getUser_id());
            builder.append(separator);
            builder.append("Name: " + getName());
            return builder.toString();
        }
}
