package recycleview.picodiploma.dicoding.com.boba;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailActivity extends AppCompatActivity {
    String namaBoba, detailBoba, hargaBoba, ratingBoba, igBoba;
    int photoBoba2;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Support Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false); // No Title

        photoBoba2 = getIntent().getIntExtra("photo",0);
        namaBoba = getIntent().getStringExtra("nama");
        detailBoba = getIntent().getStringExtra("detail");
        hargaBoba = getIntent().getStringExtra("harga");
        ratingBoba = getIntent().getStringExtra("rating");
        igBoba = getIntent().getStringExtra("ig");


        //TextView tvSeller = findViewById(R.id.tv_seller);
        TextView tvNama = findViewById(R.id.tv_name);
        TextView tvDetail = findViewById(R.id.tv_detail);
        TextView tvPrice = findViewById(R.id.tv_price);
        ImageView imgPhoto = findViewById(R.id.img_photo);
        TextView tvRating = findViewById(R.id.tv_rating);
        TextView tvIg = findViewById(R.id.tv_ig);
        ImageButton ibtn_fav = findViewById((R.id.ibtn_fav));
        ImageButton ibtn_share = findViewById(R.id.ibtn_share);

        //tvSeller.setText(String.valueOf(photoBoba2));
        tvNama.setText(namaBoba);
        tvPrice.setText(hargaBoba);
        tvDetail.setText(detailBoba);
        imgPhoto.setImageResource(photoBoba2);
        tvRating.setText(ratingBoba);
        tvIg.setText(igBoba);

        //Rata kanan kiri detail
        tvDetail.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);

        //On Click, Toast
        ibtn_fav.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), namaBoba + " is your fav :)",Toast.LENGTH_LONG).show();
            }
        });

        ibtn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SHARE " + namaBoba,Toast.LENGTH_LONG).show();
            }
        });

    }




}
