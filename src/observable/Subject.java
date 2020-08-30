package observable;

import java.util.List;

public class Subject {
    private String data;

    private List<Component> componentList;

    public Subject(List<Component> componentList) {
        this.componentList = componentList;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void refresh(String currentData) {
        setData(currentData);
        this.componentList.forEach(item -> item.show(currentData));
    }

    public void addComponent(Component component) {
        this.componentList.add(component);
    }

    


}
