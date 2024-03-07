import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<Buku> linkedList = new SinglyLinkedList<>();

        int pilihan;
        
        do {
            System.out.println("1.Tambah Buku");
            System.out.println("2.Hapus Buku");
            System.out.println("3.Cetak Daftar Buku");
            System.out.println("4.Keluar");

            System.out.print("Pilih Operasi : ");

            pilihan = input.nextInt();
            
            input.nextLine();
            switch(pilihan){
                case 1 : 
                    System.out.println("Masukan Judul Buku : ");
                    String judul = input.nextLine();
                    System.out.println("Masukan Penulis : ");
                    String penulis = input.nextLine();
                    System.out.println("Masukan Tahun Terbit : ");
                    String tahunTerbit = input.nextLine();

                    System.out.println("Masukan dari ? ( 1 : depan / 2 : belakang )");
                    int option = input.nextInt();
                    switch(option){
                        case 1:
                            linkedList.insertAtFront(new Buku(judul, penulis, tahunTerbit));
                            break;
                        case 2:
                            linkedList.insertAtBack(new Buku(judul, penulis, tahunTerbit));
                            break;
                        default:
                            System.out.println("Tidak ditemukan pilihan");
                            break;
                    }
                    break;
                case 2 :
                    System.out.println("Hapus dari ? ( 1 : depan / 2 : belakang )");
                    int deleteOption = input.nextInt();
                    switch(deleteOption){
                        case 1:
                            linkedList.removeFromStart();
                            break;
                        case 2:
                        linkedList.removeFromBack();
                            break;
                        default:
                            System.out.println("Tidak ditemukan pilihan");
                            break;
                    }
                    
                    break;
                case 3 :
                    linkedList.print();
                    break;
                case 4 :
                    break;
    
            };
    
        } while (pilihan != 4);
        
        
        input.close();
    }

}