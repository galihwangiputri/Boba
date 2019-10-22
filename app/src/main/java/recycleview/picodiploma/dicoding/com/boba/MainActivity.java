package recycleview.picodiploma.dicoding.com.boba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBoba;
    private ArrayList<Boba> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    private void showSelectedBoba(Boba boba){
        Toast.makeText(this, "Kamu pilih" + boba.getName(),Toast.LENGTH_SHORT).show();
    }
}
