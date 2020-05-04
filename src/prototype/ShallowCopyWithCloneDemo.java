package prototype;

/**
 * @ClassName ShallowCopyWithCloneDemo
 * @Description
 * @Author 25127
 * @Date 2020/5/4 8:36 下午
 * @Email jie.wang13@hand-china.com
 **/
public class ShallowCopyWithCloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Contact personContact = new Contact("123453","010-122323",
                "designpattern@163.com","designpattern.com");

        Address personAddress = new Address("China","GuangDong",
                "GuangZhou","123456",
                "aaaaa","bbbb");

        Person person = new Person("123455","Wu","Yu",
                1,personContact,personAddress);

        Address companyAddress = new Address("China","GuangDong",
                "GuangZhou","123456",
                "ccccc","dddd");

        Contact companyContact = new Contact("123456789","010-123445",
                "designpattern@163.com","desingpattern.com");

        Company company = new Company("999999","DesignPattern","Happy Life",
                companyAddress,companyContact,person);

        Company company2 = new Company("888888","DesignPattern2","Happy life",
                companyAddress,companyContact,person);

        System.out.println("The company info for company 1:" + company);
        System.out.println("The company info for company 2:" + company2);

        Company company3 = (Company) company.clone();
        company3.setCompanyName("DesignPattern3");
        System.out.println("The Company info for company 3:"+ company3);
    }
}
