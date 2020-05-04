package prototype;

/**
 * @ClassName Address
 * @Description
 * @Author 25127
 * @Date 2020/5/4 8:23 下午
 * @Email jie.wang13@hand-china.com
 **/
public class Address {
    private String country;
    private String province;
    private String city;
    private String postCode;
    private String addressLine1;
    private String addressLine2;

    public Address(String country, String province, String city, String postCode, String addressLine1, String addressLine2) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.postCode = postCode;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
