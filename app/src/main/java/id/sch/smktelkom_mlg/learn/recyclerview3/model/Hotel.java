package id.sch.smktelkom_mlg.learn.recyclerview3.model;

/**
 * Created by SMK Telkom SP Malang on 08/11/2016.
 */

import android.graphics.drawable.Drawable;

/**
 * Created by SMK Telkom SP Malang on 02/11/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;

    }
}


