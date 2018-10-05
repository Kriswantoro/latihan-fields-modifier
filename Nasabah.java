
public class Nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int noAntrian=0;
    
    public void Nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50 ){
            System.out.println("Maaf saldoe langka.");
            return saldo;
        }else{
            System.out.println("Ngemet " + uang + " sukses.");
            noAntrian++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String isi){
        if(saldo - uang < 50 ){
            System.out.println("Maaf saldoe langka.");
            return saldo;
        }else{
            System.out.println("Ngemet " + uang + " sukses.");
            noAntrian++;
            pesan=isi;
           return saldo-=uang;
           
        }
        
    }
   
}
