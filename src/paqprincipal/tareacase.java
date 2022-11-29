package tema4;

public class tareacase {
    public static void main(String[] args) {
        String estacion= "Caracas";

        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("El valor no es valido");
        }
    }
}
