package Polymorpishm;

public class pembayaranGaji {
    public int hitunganGaji(pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof direktur) 
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).bonus();
        return uang;
        
        
    }
    public static void main(String[] args) {
        pembayaranGaji pg = new pembayaranGaji();
        Staf ali=new Staf();
        direktur tony = new direktur();
        System.out.println("Gaji yang dibayarkan untuk staf ="+pg.hitunganGaji(ali));
        System.out.println("Gaji yang dibayarkan untuk Direktur ="+pg.hitunganGaji(tony));
    }
}
