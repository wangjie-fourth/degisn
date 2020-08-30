package composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyEntity extends Entity{

    private List<Entity> children = new ArrayList<>();

    public CompanyEntity(String entityName) {
        super(entityName);
    }

    @Override
    public void add(Entity entity) {
        children.add(entity);
    }

    @Override
    public void remove(Entity entity) {
        children.remove(entity);
    }

    @Override
    public void displayConstruct(int curLevel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < curLevel ; i++) {
            sb.append("-");
        }
        sb.append(entityName);
        System.out.println(sb.toString());

        children.forEach(entity -> entity.displayConstruct(curLevel + 1));

    }

    @Override
    public void showDuty() {

    }
}
