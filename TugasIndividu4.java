public class TugasIndividu4 {
    public static void main(String[] args) {

        String[][] atletPerCabang = {
            {"Annisa", "Ayu", "Anya", "Anggi", "Asri"},
            {"Budi", "Bidi", "Badu", "Bada", "Bili"},
            {"Caca", "Cici", "Cece", "Cintiya", "Cessa"},
            {"Deni", "Dani", "Danu", "Doni", "Desta"}
        };

        for (int i = 0; i < atletPerCabang.length; i++) {

            for (int j = 0; j < atletPerCabang[i].length - 1; j++) {
                for (int k = j + 1; k < atletPerCabang[i].length; k++) {
                    if (atletPerCabang[i][j].compareTo(atletPerCabang[i][k]) > 0) {
                        String temp = atletPerCabang[i][j];
                        atletPerCabang[i][j] = atletPerCabang[i][k];
                        atletPerCabang[i][k] = temp;
                    }
                }
            }

            System.out.println("Nama Atlet Cabang ke-" + (i + 1) + " (ascending):");
            for (int j = 0; j < atletPerCabang[i].length; j++) {
                System.out.println(atletPerCabang[i][j]);
            }
            System.out.println();
        }
    }
}