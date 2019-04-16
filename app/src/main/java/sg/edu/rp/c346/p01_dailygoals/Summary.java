package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView tv1 = findViewById(R.id.textView1);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");

        String Material = getString(R.string.materials);
        String Time = getString(R.string.time);
        String Problem = getString(R.string.problem);

        tv1.setText(Material + ":"+ info[0]);
        tv2.setText(Time + ":"+ info[1]);
        tv3.setText(Problem + ":"+ info[2]);
        tv4.setText("Reflection: "+ info[3]);

        Button btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
