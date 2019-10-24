package recycleview.picodiploma.dicoding.com.boba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBoba;
    private ArrayList<Boba> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Support ActionBar
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); //Custom actionbar center title
        getSupportActionBar().setCustomView(R.layout.center_title_layout); //No Title

        rvBoba = findViewById(R.id.rv_boba);
        rvBoba.setHasFixedSize(true);

        list.addAll(BobaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBoba.setLayoutManager(new LinearLayoutManager(this));
        ListBobaAdapter listBobaAdapter = new ListBobaAdapter(list);
        rvBoba.setAdapter(listBobaAdapter);

        listBobaAdapter.setOnItemClickCallback(new ListBobaAdapter.OnItemClickCallback(){

            @Override
            public void onItemClicked(Boba data) {
                showSelectedBoba(data);

            }
        });
    }

    //Buat Mene About
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        switch (itemId){
            case R.id.about:
                Intent intent_about = new Intent(this, AboutActivity.class);
                startActivity(intent_about);
        }
    }

    private void showSelectedBoba(Boba boba){

        Intent DetailIntent = new Intent(MainActivity.this, DetailActivity.class);

        DetailIntent.putExtra("nama", boba.getName());
        DetailIntent.putExtra("harga", boba.getPrice());
        DetailIntent.putExtra("photo", boba.getPhoto());
        DetailIntent.putExtra("detail", boba.getDetail());
        DetailIntent.putExtra("rating", boba.getRating());
        DetailIntent.putExtra("ig",boba.getInstagram());
        startActivity(DetailIntent);

        //Toast.makeText(this, "Kamu pilih" + boba.getPhoto() +boba.getName() + boba.getPrice() + boba.getDetail(),Toast.LENGTH_LONG).show();
    }
}