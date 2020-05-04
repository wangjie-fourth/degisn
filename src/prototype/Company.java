package prototype;

/**
 * @ClassName Company
 * @Description
 * @Author 25127
 * @Date 2020/5/4 8:19 下午
 * @Email jie.wang13@hand-china.com
 **/
public class Company implements Cloneable {
    private String companyId;
    private String companyName;
    private String description;
    private Address companyAddress;
    private Contact companyContact;
    private Person legalPerson;

    public Company(String companyId, String companyName, String description, Address companyAddress, Contact companyContact, Person legalPerson) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.description = description;
        this.companyAddress = companyAddress;
        this.companyContact = companyContact;
        this.legalPerson = legalPerson;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", description='" + description + '\'' +
                ", companyAddress=" + companyAddress +
                ", companyContact=" + companyContact +
                ", legalPerson=" + legalPerson +
                '}';
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Contact getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(Contact companyContact) {
        this.companyContact = companyContact;
    }

    public Person getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(Person legalPerson) {
        this.legalPerson = legalPerson;
    }
}
