public class Main {
    public static void main(String[] args) {
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0(cero)");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("Numero While " +numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 2;

        do {
            System.out.println("Numero Do While " +numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Numero For " + numeroFor);
        }

        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("no es una estacion");
                break;
        }
    }
}