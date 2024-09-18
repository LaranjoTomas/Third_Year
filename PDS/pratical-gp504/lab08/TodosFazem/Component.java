package lab08.TodosFazem;

import java.util.Date;

public interface Component {
    void start(Date date);

    void terminate(Date date);

    void work();
}
