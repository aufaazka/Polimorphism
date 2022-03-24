
package polimorphisme.abstrack;


public class Pegawai {
    String nama;
    int gaji;
    Pegawai(){
        
    }
    Pegawai (String nm){
        this.nama=nm;
        System.out.println("Nama Pegawai\t:"+nm);
    }
    
    public int gaji(){
        return 0;
    }
}

    