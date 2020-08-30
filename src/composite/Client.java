package composite;

import prototype.Company;

public class Client {
    public static void main(String[] args) {
        CompanyEntity rootCompany = new CompanyEntity("全球总公司");
        rootCompany.add(new HRDepartment("全球总公司HR部门"));
        rootCompany.add(new SalesDepartment("全球总公司销售部门"));

        CompanyEntity regionCompany = new CompanyEntity("地区总公司");
        regionCompany.add(new HRDepartment("地区总公司HR部门"));
        regionCompany.add(new SalesDepartment("地区总公司销售部门"));
        rootCompany.add(regionCompany);

        CompanyEntity cityCompany = new CompanyEntity("城市总公司");
        cityCompany.add(new HRDepartment("城市总公司HR部门"));
        cityCompany.add(new SalesDepartment("城市总公司销售部门"));
        regionCompany.add(cityCompany);

        rootCompany.displayConstruct(1);

    }
}
