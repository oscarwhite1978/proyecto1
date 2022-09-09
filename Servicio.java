package beans;

import java.sql.Date;

public class Servicio {
    private int id_servicio;
    private String nombre_servicio;
    private String id_usuario;
    private int id_mascota;
    private Date fecha;
    private double total;
    private String obseraciones;

    public Servicio(int id_servicio, String nombre_servicio, String id_usuario, int id_mascota, Date fecha, double total, String obseraciones) {
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
        this.id_usuario = id_usuario;
        this.id_mascota = id_mascota;
        this.fecha = fecha;
        this.total = total;
        this.obseraciones = obseraciones;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getObseraciones() {
        return obseraciones;
    }

    public void setObseraciones(String obseraciones) {
        this.obseraciones = obseraciones;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id_servicio=" + id_servicio + ", nombre_servicio=" + nombre_servicio + ", id_usuario=" + id_usuario + ", id_mascota=" + id_mascota + ", fecha=" + fecha + ", total=" + total + ", obseraciones=" + obseraciones + '}';
    }
    
    
}
