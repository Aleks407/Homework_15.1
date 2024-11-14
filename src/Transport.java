import java.util.Objects;

public class Transport implements TransportCheck {
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

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {

    }


}



