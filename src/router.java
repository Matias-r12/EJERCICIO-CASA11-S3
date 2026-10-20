public class router {
    private String nombre;
    private String direccionIP;
    private int cantidadPuertos;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDireccionIP(String direccionIP) {
        if (direccionIP != null && !direccionIP.isEmpty()) {
            this.direccionIP = direccionIP;
        }
    }

    public String getDireccionIP() {
        return this.direccionIP;
    }

    public void setCantidadPuertos(int cantidadPuertos) {
        if (cantidadPuertos > 0) {
            this.cantidadPuertos = cantidadPuertos;
        }
    }

    public int getCantidadPuertos() {
        return this.cantidadPuertos;
    }

    public void encender() {
        this.activo = true;
    }

    public void apagar() {
        this.activo = false;
    }

    public boolean isActivo() {
        return this.activo;
    }
}
