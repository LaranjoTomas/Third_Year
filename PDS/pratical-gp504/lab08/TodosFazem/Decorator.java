package lab08.TodosFazem;

import java.util.Date;

public class Decorator implements Component{
    
    private Component component;
    
    public Decorator(Component component){
        this.component = component;
    }
    
    public void start(Date date) {
        component.start(date);
    }

    public void terminate(Date date) {
        component.terminate(date);
    }

    public void work() {
        component.work();
    }
}
