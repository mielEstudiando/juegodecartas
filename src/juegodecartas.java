import java.util.Arrays;
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
        String[] puntajeC = new String[] {"01", "02",
                "03", "04", "05", "06", "07", "08",
                "09", "10", "10", "10", "11"};
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
    public static int conteoPuntaje(String[] cartas){
        String A=cartas[0];
        String B=cartas[1];
        String C=cartas[2];
        int a = A.length();
        int b = B.length();
        int c = C.length();
        int pa= Integer.valueOf(A.charAt(a-2)+A.charAt(a-1));
        int pb= Integer.valueOf(B.charAt(b-2)+B.charAt(b-1));
        int pc= Integer.valueOf(C.charAt(c-2)+C.charAt(c-1));
        return pa+pb+pc;
    }
    public static int jugar(String a){
        String[][] LasCartas= inicializarCartasJuego();
        String[] TusCartas= obtenerCartas(LasCartas);
        int Puntaje= conteoPuntaje(TusCartas);
        System.out.println(a + "s cartas son: " + Arrays.toString(TusCartas));
        System.out.println(a + " puntaje es: " + Puntaje);
        return Puntaje;
    }

    public static void main(String[] args){
        jugar("Tu");
    }
}
