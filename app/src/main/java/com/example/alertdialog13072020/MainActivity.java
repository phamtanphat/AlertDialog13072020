package com.example.alertdialog13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnShowAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnShowAlert = findViewById(R.id.buttonAlertDialog);

        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Chọn 1 trong các con vật");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                final String[] arrayAnimals = {"Mèo","Cá","Heo","Gà","Cọp","Sư tử"};

                // Lựa chọn 1 trong những
                builder.setSingleChoiceItems(arrayAnimals, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, arrayAnimals[i], Toast.LENGTH_SHORT).show();
                    }
                });
                // Nút tích cực (Nút Có)
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }
}