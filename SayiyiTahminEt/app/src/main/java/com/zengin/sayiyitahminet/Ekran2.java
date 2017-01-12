package com.zengin.sayiyitahminet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Ekran2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekran2);
    }
    public int[]dizi= new int[3];
    public void Üret(View v){

        EditText t1=(EditText)findViewById(R.id.editText);
        int sinir= Integer.parseInt(String.valueOf(t1.getText()));
        Random rnd= new Random();
        int sayi=0;
        boolean durum= false;
        for(int i=0;i<dizi.length;i++){
            durum=false;
            while (durum==false){
                sayi=rnd.nextInt(sinir);
                for(int j=0;j<dizi.length;j++){
                    if(dizi[j]==sayi)
                        break;
                    if(j==dizi.length-1)
                        durum=true;
                }
            }
            dizi[i]=sayi;
        }
        EditText t2=(EditText)findViewById(R.id.editText2);
        t2.setText(String.valueOf(dizi[0]));
        EditText t3=(EditText)findViewById(R.id.editText3);
        t3.setText(String.valueOf(dizi[1]));

    }
    public int hak=5;
    public void tahmin(View v){
        EditText thm=(EditText)findViewById(R.id.editText5);
        int tahmin= Integer.parseInt(String.valueOf(thm.getText()));
        if(dizi[2]==tahmin){
            hak=hak+1;
            Toast.makeText(getApplicationContext(),"Doğru tahmin ettiniz.Kalan hakkınız:"+ String.valueOf(hak),Toast.LENGTH_SHORT).show();
        }
        else if (dizi[2]!=tahmin){
            hak=hak-1;
            if(hak==0)  {
                Toast.makeText(getApplicationContext(),"GAME OVER :D",Toast.LENGTH_SHORT).show();
            }
            else if(hak>0){
                Toast.makeText(getApplicationContext(), "Yanlış tahmin ettiniz.Kalan hakkınız:"+ String.valueOf(hak),Toast.LENGTH_SHORT).show();
            }
        }

    }

}
