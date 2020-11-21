package pboif2.pkg10119065.latihan53.rabbit;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan objek Rabbit
 */
public class Rabbit extends Animal{
    
    private String color,name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }  
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
