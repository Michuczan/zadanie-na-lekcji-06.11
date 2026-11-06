package com.example.zadanienalekcji;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ImageView imageView;
    protected Button buttonWstecz, buttonLosuj, buttonNastepny;
    int aktuanyObraz = 0;
    protected TextView textView;
    ArrayList<Integer> obrazki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView = findViewById(R.id.imageView3);
        buttonWstecz = findViewById(R.id.buttonWstecz);
        buttonLosuj = findViewById(R.id.buttonLosuj);
        buttonNastepny = findViewById(R.id.buttonNastepny);
        textView = findViewById(R.id.textView2);
        obrazki = new ArrayList<>();
        obrazki.add(R.drawable.porsche);
        obrazki.add(R.drawable.centenario);
        obrazki.add(R.drawable.chiron);
        obrazki.add(R.drawable.merc);
        obrazki.add(R.drawable.veyron);



        buttonWstecz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aktuanyObraz--;
                imageView.setImageResource(obrazki.get(aktuanyObraz));
            }
        });

        buttonNastepny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aktuanyObraz++;
                imageView.setImageResource(obrazki.get(aktuanyObraz));
            }
        });
    }
}