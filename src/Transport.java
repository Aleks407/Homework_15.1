
public abstract class Transport implements TransportService {
    private  String modelName;
    private  int wheelsCount;

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
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
@Override
public void transportCheck(Transport transport) {
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

    public abstract void transportCheck();
}





