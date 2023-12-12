import java.util.Random;
        import java.util.Scanner;

 public class exercici15 {

     public static void main(String[] args) {
         // Demanar nom i el primer cognom
         Scanner scanner = new Scanner(System.in);
         System.out.print("Entra el nom i primer cognom de l'usuari: ");
         String nomCognom = scanner.nextLine();

         // Generem la contrasenya
         String contrasenya = generarContrasenya(nomCognom);

         // Mostrar la contrasenya
         System.out.println("La contrasenya és: " + contrasenya);
     }

     // Mètode per generar la contrasenya
     private static String generarContrasenya(String nomCognom) {
         // Obté la primera lletra del nom en majúscules
         String inicialNom = nomCognom.substring(0, 1).toUpperCase();

         // Obté la primera lletra del cognom en majúscules
         String inicialCognom = nomCognom.substring(nomCognom.indexOf(' ') + 1, nomCognom.indexOf(' ') + 2).toUpperCase();

         // Obté la segona lletra del nom
         String segonaLletraNom = nomCognom.substring(1, 2).toLowerCase();

         // Obté la segona lletra del cognom
         String segonaLletraCognom = nomCognom.substring(nomCognom.indexOf(' ') + 2, nomCognom.indexOf(' ') + 3).toLowerCase();

         // Genera 4 dígits aleatoris
         Random rand = new Random();
         StringBuilder digits = new StringBuilder();
         for (int i = 0; i < 4; i++) {
             digits.append(rand.nextInt(10));
         }

         // Combina les lletres i els dígits per obtenir la contrasenya final
         return inicialNom + inicialCognom + segonaLletraNom + segonaLletraCognom + digits.toString();
     }
}
