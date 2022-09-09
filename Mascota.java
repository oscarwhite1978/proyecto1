package beans;

public class Mascota {
    private int id_mascota;
    private String nombre_mascota;
    private String raza;
    private String genero;
    private int tamano;
    private int anos_mascota;
    private String vacunado;
    private String esterilizado;
    private String observaciones;

    public Mascota(int id_mascota, String nombre_mascota, String raza, String genero, int tamano, int anos_mascota, String vacunado, String esterilizado, String observaciones) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.genero = genero;
        this.tamano = tamano;
        this.anos_mascota = anos_mascota;
        this.vacunado = vacunado;
        this.esterilizado = esterilizado;
        this.observaciones = observaciones;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getAnos_mascota() {
        return anos_mascota;
    }

    public void setAnos_mascota(int anos_mascota) {
        this.anos_mascota = anos_mascota;
    }

    public String getVacunado() {
        return vacunado;
    }

    public void setVacunado(String vacunado) {
        this.vacunado = vacunado;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", nombre_mascota=" + nombre_mascota + ", raza=" + raza + ", genero=" + genero + ", tamano=" + tamano + ", anos_mascota=" + anos_mascota + ", vacunado=" + vacunado + ", esterilizado=" + esterilizado + ", observaciones=" + observaciones + '}';
    }
    
    
}
