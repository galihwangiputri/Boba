package recycleview.picodiploma.dicoding.com.boba;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Landing_Activity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_);


        Button btnIn = findViewById(R.id.btn_in);
        btnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Landing_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Text
        TextView land_text = findViewById(R.id.land_text);
        land_text.setText(
                "Hi Boba give you " +
                "\na sort of popular bubble tea" +
                        "\nbased of TripZilla.com info" +
                        "\n-TripZilla.com");
        TextView land_notes = findViewById(R.id.land_notes);
        land_notes.setText("Notes: the rating is random value");
    }
}
