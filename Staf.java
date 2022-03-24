
package polimorphisme.abstrack;

public class Staf extends Pegawai {
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
       Staf (String nm){
        this.nama=nm;
        System.out.println("Nama Staf\t:"+nm);
        
    }
}
