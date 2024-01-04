package multiThreadSingletonSafe;

public final class Singleton {
    /*
    volatile :
    멀티 스레드 환경에서 변수의 값을 동기화한다.
    하지만, 원자성을 보장하지 않기 때문에 synchronized의 사용이 요구된다.
     */
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
