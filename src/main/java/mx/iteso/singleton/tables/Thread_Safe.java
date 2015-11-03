package mx.iteso.singleton.tables;

/**
 * Created by Lily on 02/11/2015.
 */
public class Thread_Safe {
    private static Thread_Safe instance = null;

    protected Thread_Safe() {
    }

    // Lazy Initialization (If required then only)
    public static Thread_Safe getInstance() {
        if (instance == null) {
            // Thread Safe. Might be costly operation in some case
            synchronized (Thread_Safe.class) {
                if (instance == null) {
                    instance = new Thread_Safe();
                }
            }
        }
        return instance;
    }
}
