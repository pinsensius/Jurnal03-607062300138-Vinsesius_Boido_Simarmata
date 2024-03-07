public class Buku{
    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    

    @Override
    public String toString() {
        return "|> Buku [ Judul = " + judul + ", Penulis = " + penulis + ", Tahun Terbit = " + tahunTerbit + " ] \n";
    }



    public String getJudul() {
        return judul;
    }



    public String getPenulis() {
        return penulis;
    }



    public String getTahunTerbit() {
        return tahunTerbit;
    }


    

}