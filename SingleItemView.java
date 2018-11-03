package com.teguhsusanto.testandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends Activity {
    // Declare Variables
    String nama;
    String alamat;
    String deskripsi;
    String gambar;
    ImageLoader imageLoader = new ImageLoader(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.singleitemview);

        Intent i = getIntent();
        // Get the result of rank
        nama = i.getStringExtra("nama");
        // Get the result of country
        alamat = i.getStringExtra("alamat");
        // Get the result of population
        deskripsi = i.getStringExtra("deskripsi");
        // Get the result of flag
        gambar = i.getStringExtra("gambar");

        // Locate the TextViews in singleitemview.xml
        TextView txtnama = (TextView) findViewById(R.id.nama_pariwisata_detail);
        TextView txtalamat = (TextView) findViewById(R.id.alamat_pariwisata_detail);
        TextView txtdeskripsi = (TextView) findViewById(R.id.deskripsi_pariwisata_detail);

        // Locate the ImageView in singleitemview.xml
        ImageView imgflag = (ImageView) findViewById(R.id.gambar_detail);

        // Set results to the TextViews
        txtnama.setText(nama);
        txtalamat.setText(alamat);
        txtdeskripsi.setText(deskripsi);

        // Capture position and set results to the ImageView
        // Passes flag images URL into ImageLoader.class
        imageLoader.DisplayImage(gambar, imgflag);
    }

}
