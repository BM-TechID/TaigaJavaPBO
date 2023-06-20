/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taiga;

/**
 *
 * @author mansy
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Encryption {
    public static String encrypt(String password) {
        try {
            // Membuat instance MessageDigest dengan algoritma MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Mengubah password menjadi array of bytes
            byte[] passwordBytes = password.getBytes();

            // Menghitung hash dari password menggunakan MD5
            byte[] hashedBytes = md.digest(passwordBytes);

            // Mengubah hash menjadi format heksadesimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Menampilkan pesan error atau melakukan tindakan lainnya
            e.printStackTrace();
            return null;
        }
    }
}

