package recycleview.picodiploma.dicoding.com.boba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private ArrayList<Boba> list = new ArrayList<>();
    String nama, email;
    Integer photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Support ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        ImageView imgPhoto = findViewById(R.id.img_penulis);
        TextView tvNama = findViewById(R.id.tv_nama_penulis);
        TextView tvEmail = findViewById(R.id.tv_email);


        Penulis putri = new Penulis();
        putri.setNama("Galih Wangi Putri");
        putri.setEmail("galihwangiputri@gmail.com");
        putri.setPhoto(R.drawable.about);
        nama = putri.getNama();
        email = putri.getEmail();
        photo = putri.getPhoto();

        tvNama.setText(nama);
        tvEmail.setText(email);
        imgPhoto.setImageResource(photo);
    }
}
