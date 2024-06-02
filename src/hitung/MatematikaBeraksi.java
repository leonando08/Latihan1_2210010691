package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika nando = new Matematika(9,1);
        
        System.out.println("Hasil Penjumlahan: " + nando.setPenjumlahan());
        System.out.println("Hasil Pengurangan: " + nando.setPengurangan());
        System.out.println("Hasil Perkalian: " + nando.setPerkalian());
        System.out.println("Hasil Pembagian: " + nando.setPembagian());
    }
    
}
