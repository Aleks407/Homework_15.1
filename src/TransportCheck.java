public interface TransportCheck {
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

    void updateTyre();

    void checkEngine();

    void checkTrailer();
}
