package composite;

public class SalesDepartment extends Entity{
    public SalesDepartment(String entityName) {
        super(entityName);
    }

    @Override
    public void add(Entity entity) {

    }

    @Override
    public void remove(Entity entity) {

    }

    @Override
    public void displayConstruct(int curLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < curLevel ; i++) {
            sb.append("-");
        }
        sb.append(entityName);
        System.out.println(sb.toString());
    }

    @Override
    public void showDuty() {
        System.out.println(String.format("%s : 销售", entityName));
    }
}
