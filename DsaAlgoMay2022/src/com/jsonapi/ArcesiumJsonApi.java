package com.jsonapi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArcesiumJsonApi {
    /*public static void main(String[] args) {
        System.out.println(apiResponseParser());

    }*/
//    public static List<Integer> apiResponseParser(List<String> inputList, int size) {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        List<Contacts> contactsList = new ArrayList<>();
        Gson gson = new Gson();
        String urlString = "https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users";
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            contactsList = gson.fromJson(reader, new TypeToken<List<Contacts>>() {}.getType());
            System.out.println(contactsList);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<String> inputList = new ArrayList<>();
        inputList.add("username");
        inputList.add("EQUALS");
        inputList.add("CharviM");


        if (inputList.get(1).equals("EQUALS")) {
            for(Contacts c : contactsList) {
                if(inputList.get(0).equals("id")) {
                    if(c.getId() == Long.getLong(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("name")) {
                    if(c.getName().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("username")) {
                    if(c.getUsername().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("email")) {
                    if(c.getEmail().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.street")) {
                    if(c.getAddress().getStreet().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.suite")) {
                    if(c.getAddress().getSuite().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.city")) {
                    if(c.getAddress().getCity().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.zipcode")) {
                    if(c.getAddress().getZipcode().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.geo.lat")) {
                    if(c.getAddress().getGeo().getLat() ==  Double.valueOf(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.geo.lng")) {
                    if(c.getAddress().getGeo().getLng() ==  Double.valueOf(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("website")) {
                    if(c.getWebsite().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("company.name")) {
                    if(c.getCompany().getName().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("company.basename")) {
                    if(c.getCompany().getBaseName().equals(inputList.get(2))) {
                        results.add(c.getId());
                    }
                }
            }
        } else {
            for(Contacts c : contactsList) {
                String str = inputList.get(2);
                String[] strArr = str.split(",");
                List<String> strList = Arrays.asList(strArr);
                if(inputList.get(0).equals("id")) {
                    if (strList.contains(String.valueOf(c.getId()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("name")) {
                    if (strList.contains(String.valueOf(c.getName()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("username")) {
                    if (strList.contains(String.valueOf(c.getUsername()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("email")) {
                    if (strList.contains(String.valueOf(c.getEmail()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.street")) {
                    if (strList.contains(String.valueOf(c.getAddress().getStreet()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.suite")) {
                    if (strList.contains(String.valueOf(c.getAddress().getSuite()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.city")) {
                    if (strList.contains(String.valueOf(c.getAddress().getCity()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.zipcode")) {
                    if (strList.contains(String.valueOf(c.getAddress().getZipcode()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.geo.lat")) {
                    if (strList.contains(String.valueOf(c.getAddress().getGeo().getLat()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("address.geo.lng")) {
                    if (strList.contains(String.valueOf(c.getAddress().getGeo().getLng()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("website")) {
                    if (strList.contains(String.valueOf(c.getWebsite()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("company.name")) {
                    if (strList.contains(String.valueOf(c.getCompany().getName()))) {
                        results.add(c.getId());
                    }
                } if(inputList.get(0).equals("company.basename")) {
                    if (strList.contains(String.valueOf(c.getCompany().getName()))) {
                        results.add(c.getId());
                    }
                }
            }
        }

        if(results.size() == 0) {
            results.add(-1);
        }
        System.out.println(results);
    }
}

class Contacts {

    int id;
    String name;
    String username;
    String email;
    Address address;
    String website;
    Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

class Address {

    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}

class Geo {
    double lat;
    double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
class Company {

    String name;
    String baseName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }
}

