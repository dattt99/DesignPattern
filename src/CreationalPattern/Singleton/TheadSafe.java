package CreationalPattern.Singleton;

public class TheadSafe {
    private static volatile TheadSafe instance;

    private TheadSafe(){

    }

    public static synchronized TheadSafe getInstance(){
        if(instance == null)
            instance = new TheadSafe();
        return instance;
    }
}
