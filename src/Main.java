public class Main{
    public static void main() {
        router r = new router();
        r.setNombre("Router Core");
        r.setDireccionIP("10.0.0.1");
        r.setCantidadPuertos(24);

        r.encender();
        System.out.println("Router encendido: " + r.isActivo());
    }
}