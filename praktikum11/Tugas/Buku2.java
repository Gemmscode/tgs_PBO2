/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.Tugas;
/**
 *
 * @author Najmi Mukia Barkah
 */
public class Buku2 {
    private String judul;
    private Pengarang pengarang;
    
    public Buku2(String judul,Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}