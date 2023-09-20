package de.telran.lesson18;

public class Taskr {
    public static void main(String[] args) {
        // Creăm un array de tip String cu dimensiunea 7
        String[] zileSaptamana = new String[7];

        // Adăugăm valori pentru fiecare zi a săptămânii
        zileSaptamana[0] = "Luni";
        zileSaptamana[1] = "Marți";
        zileSaptamana[2] = "Miercuri";
        zileSaptamana[3] = "Joi";
        zileSaptamana[4] = "Vineri";
        zileSaptamana[5] = "Sâmbătă";
        zileSaptamana[6] = "Duminică";

        // Afișăm valoarea ultimului element (Duminică)
        System.out.println("Ultima zi a săptămânii este: " + zileSaptamana[6]);
    }

}
