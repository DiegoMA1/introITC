public class Condicones3{
    public static void main (String [] args){
        int opcion;
        Scanner lector = new Scanner (System.in);
        opcion=lector.nextInt();
        switch(opcion){
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Primo");
                break;
            case 0:
            case 1:
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println("No primo");
                break;
            default:
            System.out.println("Esa opción no existe");

        }
    }
}