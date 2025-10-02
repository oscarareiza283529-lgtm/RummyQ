package EjercerTurno;

public class Controller {

    private Model m;

    public void terminarTurno(){
        m.terminarTurno(); 
    }

    public void seleccionarFichasJugador(int[] posicionFicha) {
        m.seleccionarFichasJugador(posicionFicha);
    }

    public void seleccionarFichasTablero(int[] posicionesFichas, int idFichaSeleccionada) {
        m.seleccionarFichasTablero(posicionesFichas, idFichaSeleccionada);
    }

    public void quitarFichasJugador(int[] posicionesFichas) {
        m.quitarFichasJugador(posicionesFichas);
    }

    public void quitarFichasTablero(int[] idsFichas) {
        m.quitarFichasTablero(idsFichas);
    }

    public void agregarFichasTablero(int[] idsFichas, int numeroGrupo) {
        m.agregarFichasTablero(idsFichas, numeroGrupo);
    }
    //constructor del Controlador(Controller)
    public Controller(){
        m = new Model();
    }
    
}
