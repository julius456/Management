/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.model;

/**
 *
 * @author junie
 */
public class Address {
    private long id;
    private User user;
    private String region;
    private String province;
    private String city;
    private String barangay;
    
    public Address(){}

    public Address(long id, User user, String region, String province, String city, String barangay) {
        this.id = id;
        this.user = user;
        this.region = region;
        this.province = province;
        this.city = city;
        this.barangay = barangay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + id + ", user=" + user + ", region=" + region + ", province=" + province + ", city=" + city + ", barangay=" + barangay + '}';
    }
    
    
    
}
