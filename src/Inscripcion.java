public class Inscripcion {
    int numInscripcion;
    Categoria categoria;
    Participante participante;
    int monto;

    public Inscripcion(int numInscripcion, Categoria categoria, Participante participante){
        this.numInscripcion=numInscripcion;
        this.categoria=categoria;
        this.participante=participante;

        if(categoria.getNombre().equals("Circuito Chico")){
            if(participante.getEdad()<18){
                this.monto=1300;
            }else{
                this.monto=1500;
            }
        }

        if(categoria.getNombre().equals("Circuito Medio")){
            if(participante.getEdad()>18){
                this.monto=2000;
            }else{
                this.monto=2300;
            }
        }

        if(categoria.getNombre().equals("Circuito Avanzado")){
            if(participante.getEdad()<18){
                System.out.println("No se puede inscribir!");
            }else{
                this.monto=2800;
            }
        }
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getNumInscripcion() {
        return numInscripcion;
    }

    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }
}
