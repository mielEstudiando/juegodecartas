import java.util.Random;
public class juegodecartas {
    public static String[][] crearMatrizCartas(){
        return new String[13][4];
    }

    public static void agregarCartas(String[][] Matriz,
                                     String carta, String puntaje,
                                     int f, int c){
        Matriz[f][c]= carta + ", " + puntaje;
    }

    public static String[][] inicializarCartasJuego(){
        String[] simbolos = new String[] {"Corazones",
                "Diamantes", "Picas", "Tréboles"};
        String[] numeros = new String[] {"1", "2",
                "3", "4", "5", "6", "7", "8", "9",
                "J", "Q", "K", "A"};
        String[] puntajeC = new String[] {"1", "2",
                "3", "4", "5", "6", "7", "8", "9",
                "10", "10", "10", "11"};
        String[][] MatrizCartas = crearMatrizCartas();

        for (int fila=0;fila<13;fila++){
            for (int colum=0; colum<4; colum++){

                agregarCartas(MatrizCartas,
                        numeros[fila] + " de " + simbolos[colum],
                        puntajeC[fila], fila, colum);
            }
        }
        return MatrizCartas;
    }

    public static String[] obtenerCartas(String[][] matriz){
        String[] cartas = new String[3];
        for (int i=0; i<3; i++){
            Random random= new Random();
            int cartaA= random.nextInt(13);
            int cartaB= random.nextInt(4);
            cartas[i]=matriz[cartaA][cartaB];
        }
        return cartas;
    }

    public static void main(String[] args){
        String[][] matrizCartas =inicializarCartasJuego();
        Random random= new Random();
        int cartaA= random.nextInt(2);
        System.out.println(cartaA);
    }
}
