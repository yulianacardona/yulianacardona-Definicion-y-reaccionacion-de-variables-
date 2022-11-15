import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String name;
        int sueldo;
        int  dias;
        String name2;
        int  dias2;
        int pago2;
        String name3;
        int  dias3;
        int pago3;
        String name4;
        int  dias4;
        int pago4;
        sueldo = 1000000;
        double horas;
        System.out.println("hola usuario  digita tu nombre");
        name = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        dias = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas");
        horas = Sc.nextByte();
        System.out.println("su nombre es " +name+ " bien y su edad es" +dias+
                " y sus horas son" +horas+ "");
        System.out.println("y su pago es " +sueldo+ "gracias por consultar el siguiente ");
        System.out.println("hola buenas  digita tu nombre");
        name2 = Sc.nextLine();
        System.out.println("hola usuario digita tu edad");
        dias2 = Sc.nextInt();

        System.out.println("hola usuario digita horas trabajadas");
        pago2 = Sc.nextByte();
        System.out.println("su nombre es " +name2+ " bien y su edad es" +dias2+ " y sus horas son" );
        System.out.println("y su pago es " +pago2+ "gracias por consultar el siguiente ");
        System.out.println("hola buenas digita tu nombre");
        name3 = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");

        dias3 = Sc.nextInt();
        System.out.println("hola buenas digita horas trabajadas");
        pago3 = Sc.nextByte();
        System.out.println("su nombre es " +name3+ " bien y su edad es" +dias3+ " y sus horas son" );
        System.out.println("y su pago es " +pago3+ "gracias por consultar el siguiente ");
        System.out.println("hola buenas digita tu nombre");
        name4 = Sc.nextLine();
        System.out.println("hola usuario digita tu edad");
        dias4 = Sc.nextInt();
        System.out.println("hola usuario digita horas trabajadas");
        pago4 = Sc.nextByte();
        System.out.println("su usuario es " +name4+ " bien y su edad es" +dias4+ " y sus horas son" );
        System.out.println("y su pago es " +pago4+ "gracias por consultar el siguiente ");
        System.out.println("y su pago es " +sueldo+ "gracias por consultar el siguiente ");


    }

}