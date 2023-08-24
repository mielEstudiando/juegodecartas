import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
    public static int conteoPuntaje(String[] cartas, int n){
        String A=cartas[n];
        System.out.println(A);
        int a = A.length();
        char[] palabra= {A.charAt(a-2),A.charAt(a-1)};
        String A2= new String(palabra);
        int pa= Integer.valueOf(A2);
        System.out.println(pa);
        return pa;
    }

    public static int conteoTotal(String[] cartas){
        int a = conteoPuntaje(cartas,0);
        int b = conteoPuntaje(cartas,1);
        int c = conteoPuntaje(cartas,2);
        return a+b+c;
    }
    public static int jugar(String a){
        String[][] LasCartas= inicializarCartasJuego();
        String[] TusCartas= obtenerCartas(LasCartas);
        int Puntaje= conteoTotal(TusCartas);
        System.out.println(a + "s cartas son: " + Arrays.toString(TusCartas));
        System.out.println(a + " puntaje es: " + Puntaje);
        return Puntaje;
    }

    public static void menu(){
        System.out.println("♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠");
        System.out.println("1. Jugar Partida.");
        System.out.println("2. Cerrar");
        System.out.println("♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠♡♢♣♠");
    }
    public static void accion(){
        Scanner scanner = new Scanner(System.in);
        String resp = scanner.nextLine();
        if (resp=="1"){
            int tu=jugar("tu");
            int su=jugar("su");
            if (tu>20){
                if (su>20){
                    System.out.println("Ninguno ganó la partida");
                }
                else {
                    System.out.println("Gana el jugador 2 con " + su + " puntos.");
                }
                }
            else if (su>20){
                System.out.println("Gana el jugador 1 con " + tu + " puntos.");
            }
        }
    }
    public static void main(String[] args){
        boolean on = true;
        while (on){
            menu();

        }
    }
}
