import java.util.Objects;

public abstract class Transport implements TransportCheck {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Transport: " +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return wheelsCount == transport.wheelsCount && Objects.equals(modelName, transport.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    static void checkTransport(Transport transport) {
        if (transport.getWheelsCount() == 2) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        } else if (transport.getWheelsCount() > 2 & transport.getWheelsCount() <= 4) {

            System.out.println("Обслуживаем " + transport.getModelName());
            transport.checkEngine();
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        } else {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.checkEngine();
            transport.checkTrailer();
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();


            }
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}




