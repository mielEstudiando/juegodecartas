public class juegodecartas {
    public static void crearMatrizCartas(){
        String[][] MatrizCartas = new String[13][4];
    }

    public static void agregarCartas(String[][] Matriz, String carta, String puntaje, int p, int c){
        Matriz[p][c]= carta + ", " + puntaje;
    }

    public static void inicializarCartasJuego(){
        String[] simbolos = new String[] {"Corazones", "Diamantes", "Picas", "Tréboles"};
        String[] numeros = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
        crearMatrizCartas();

        for (int i=0;i<13;i++){
            for (int j=0; j<4; j++){

                MatrizCartas[][]
            }
        }

    }
}
