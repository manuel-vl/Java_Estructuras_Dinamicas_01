public class Participante {
    int id;
    String dni;
    String nombre;
    String apellido;
    int edad;
    String celular;
    String numeroEmergencia;
    String grupoSanguineo;

    public Participante(int id,String dni,String nombre,String apellido,int edad,String celular,String numeroEmergencia,String grupoSanguineo) {
        this.id=id;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.celular=celular;
        this.numeroEmergencia=numeroEmergencia;
        this.grupoSanguineo=grupoSanguineo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
}
