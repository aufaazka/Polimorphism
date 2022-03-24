
package polimorphisme.abstrack;

class PembayaranGaji {
    
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        
        if (peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        
        if (peg instanceof CEO)
            uang+=((CEO)peg).tunjangan();
        
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf("Ali");
        System.out.println("gaji staf = "+pg.hitungGaji(ali));
        System.out.println("==================================");
        Direktur Tony = new Direktur("Tony");
        System.out.println("gaji direktur = "+pg.hitungGaji(Tony));
          System.out.println("==================================");
        CEO Fabian= new CEO("Fabian");
        System.out.println("gaji CEO = "+pg.hitungGaji(Fabian));
    }
}

