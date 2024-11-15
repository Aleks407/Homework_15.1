public class PrintServiceStation {
    public void check(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            Transport.checkTransport(transport[i]);
            System.out.println();


        }
    }
}




