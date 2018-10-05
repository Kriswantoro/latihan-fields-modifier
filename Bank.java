
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        Nasabah n=new Nasabah();
        n.Nasabah("Kriswantoro");
        n.tabungan(10000000);
        n.ambilUang(4000000);
        n.ambilUang(500000,"Membeli Buah-buahan");

        System.out.println(n.getSaldo());
        System.out.println(n.getSaldo() + "  " + n.getPesan());

        System.out.println();
        Nasabah n1=new Nasabah();
        n1.Nasabah("Fajar Maulana");
        n1.tabungan(15000000);
        n1.ambilUang(400000);
        
        System.out.println("\nTotal Transaksi Ambil Uang : " + n1.noAntrian);
        
    }
    
}
