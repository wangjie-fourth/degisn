package prototype;

/**
 * @ClassName Contact
 * @Description
 * @Author 25127
 * @Date 2020/5/4 8:23 下午
 * @Email jie.wang13@hand-china.com
 **/
public class Contact {
    private String phone;
    private String fax;
    private String email;
    private String website;

    public Contact(String phone, String fax, String email, String website) {
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.website = website;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
