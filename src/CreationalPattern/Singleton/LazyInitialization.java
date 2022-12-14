package CreationalPattern.Singleton;

public class LazyInitialization {
    private static LazyInitialization instance;

    public LazyInitialization() {
    }

    public static LazyInitialization getInstance(){
        if(instance == null)
            instance = new LazyInitialization();
        return instance;
    }
}
