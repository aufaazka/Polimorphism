
package polimorphisme.abstrack;


public class CEO extends Pegawai {
   private static final int gajiDir=5000000;
    private static final int tunjangan=500000;
    
    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
       CEO (String nm){
        this.nama=nm;
        System.out.println("Nama Staf\t:"+nm);
        
    }
} 

