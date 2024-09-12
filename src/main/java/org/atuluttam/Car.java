package org.atuluttam;

public class Car {
    //Name "pe should be matched with the bean id to Inject it
    // when autowire set to "byName"" and there must be the corresponding setter injection
    private Engine de;

    public Car() {
    }

    public Engine getDe() {
        return de;
    }

    public void setDe( Engine engine) {
        this.de = engine;
    }

    public Car(Engine engine) {
        this.de = engine;
    }

    public void startcar()
    {
        de.start();
    }
}
