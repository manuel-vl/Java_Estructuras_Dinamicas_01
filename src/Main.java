import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Inscripcion> inscripciones=new ArrayList<>();

        Categoria catChico=new Categoria(1,"Circuito Chico", "2km por selva");
        Categoria catMedio=new Categoria(2, "Circuito Medio", "5km por selva, arroyos y barro");
        Categoria catGrande = new Categoria(3,"Circuito Grande","10 km por selva, arroyos, barro y escalada en piedra.");

        Participante participante1=new Participante(1, "1000920570", "Manuel", "Valencia",23,"12345678","12345678", "O+" );
        Participante participante2=new Participante(2, "1000920570", "Manuel2", "Valencia2",23,"12345678","12345678", "O+" );

        Inscripcion inscripcion1=new Inscripcion(1, catChico, participante1);
        Inscripcion inscripcion2=new Inscripcion(2, catChico, participante2);

        // Agregando objeto inscripcion al array de Inscripciones
        inscripciones.add(inscripcion1);
        inscripciones.add(inscripcion2);

        // Recorriendo nuestra lista (Array de inscripcion)
        int montoCatChicho=0;
        int montoCatMedio=0;
        int montoCatGrande=0;

        for (Inscripcion inscripcion: inscripciones){
            if(inscripcion.categoria.getNombre().equals("Circuito Chico")){
                montoCatChicho+=inscripcion.getMonto();
                System.out.println("Nombre: "+inscripcion.participante.getNombre());
                System.out.println("Numero inscripcion: "+inscripcion.getNumInscripcion());
            }

            if(inscripcion.categoria.getNombre().equals("Circuito Medio")){
                montoCatMedio+=inscripcion.getMonto();
                System.out.println("Nombre: "+inscripcion.participante.getNombre());
                System.out.println("Numero inscripcion: "+inscripcion.getNumInscripcion());
            }

            if(inscripcion.categoria.getNombre().equals("Circuito Grande")){
                montoCatGrande+=inscripcion.getMonto();
                System.out.println("Nombre: "+inscripcion.participante.getNombre());
                System.out.println("Numero inscripcion: "+inscripcion.getNumInscripcion());
            }
        }

        int total=montoCatChicho+montoCatMedio+montoCatGrande;

        System.out.println("Total monto categoria chico: "+ montoCatChicho);
        System.out.println("Total monto categoria medio: "+ montoCatMedio);
        System.out.println("Total monto categoria grande: "+ montoCatGrande);
        System.out.println("Total monto todas las categories: "+ total);
    }
}
