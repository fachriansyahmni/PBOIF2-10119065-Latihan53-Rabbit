package pboif2.pkg10119065.latihan53.rabbit;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan objek Rabbit
 */
public class PBOIF210119065Latihan53Rabbit {
    
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("Peter",false,"grass",4,"grey");
        
        System.out.println("Hello, His name is "+rabbit1.getName());
        System.out.println(rabbit1.getName()+" is Vegetarian ? "+rabbit1.isVegetarian());
        System.out.println(rabbit1.getName()+" eats "+rabbit1.getEats());
        System.out.println(rabbit1.getName()+" has "+rabbit1.getNoOfLegs()+ "legs");
        System.out.println(rabbit1.getName()+" color is "+rabbit1.getColor());
    }
    
}
