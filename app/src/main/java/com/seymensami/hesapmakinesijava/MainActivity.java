package com.seymensami.hesapmakinesijava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    String text1="";
    Button buton1,buton2,buton3,buton4,buton5,buton6,buton7,buton8,buton9,buton0,butonnokta,butonesittir,butontopla,butoneksi,butoncarp,butonbol,butonmod,butonsil,butonhepsinisil,butonusalma,butonlog;
    TextView sonucText;
    EditText islemText;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println(Math.log10(40));
        System.out.println(Math.pow(2,3));




        Vibrator titret = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        butonlog=findViewById(R.id.buttonlog);

        butonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                double sayi2=0;
                double sayi1=0;
                if(sonucText.length()!=0){
                    text1=sonucText.getText().toString().substring(0,sonucText.length()-1);
                }

                if(text1.length()!=0){
                    sayi1=Double.parseDouble(text1);
                }
                if(islemText.length()!=0){
                    sayi2=Double.parseDouble(islemText.getText().toString());
                }

                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()==0){
                    String log=new DecimalFormat("##.##").format(Math.log10(sayi2)).replace(',','.');
                    sonucText.setText(log);
                    islemText.setText("");

                }else if(sonucText.length()!=0 && g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){
                    switch(g){
                        case "+":

                            String toplam=new DecimalFormat("##.##").format(sayi1+Math.log10(sayi2)).replace(',','.');
                            sonucText.setText(toplam);
                            islemText.setText("");
                            break;
                        case "-":

                            String eksi=new DecimalFormat("##.##").format(sayi1-Math.log10(sayi2)).replace(',','.');
                            sonucText.setText(eksi);
                            islemText.setText("");
                            break;
                        case "%":

                            String mod=new DecimalFormat("##.##").format(sayi1%Math.log10(sayi2)).replace(',','.');
                            sonucText.setText(mod);
                            islemText.setText("");
                            break;

                        case "×":

                            String carp=new DecimalFormat("##.##").format(sayi1*Math.log10(sayi2)).replace(',','.');
                            sonucText.setText(carp);
                            islemText.setText("");
                            break;
                        case "÷":

                            String bol=new DecimalFormat("##.##").format(sayi1/Math.log10(sayi2)).replace(',','.');
                            sonucText.setText(bol);
                            islemText.setText("");
                            break;
                        case "^":

                            String us=new DecimalFormat("##.##").format(Math.pow(sayi1,Math.log10(sayi2))).replace(',','.');
                            sonucText.setText(us);
                            islemText.setText("");
                            break;
                        default:Toast.makeText(getApplicationContext(), "İşlem yok", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        butonusalma=findViewById(R.id.buttonusalma2);

        butonusalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){

                        int f=1;
                        if(d.length()==0){
                            Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                            f=0;
                        }
                        if(f==1){
                            sonucText.setText(d+"^");
                        }
                    }else{
                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"^");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"^");

                        }
                    }
                } else if (sonucText.length()==0) {

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"^");
                    islemText.setText("");

                }else{
                    System.out.println("else");
                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"^");
                    islemText.setText("");

                }
            }
        });
        buton1=findViewById(R.id.button1);
        buton2=findViewById(R.id.button2);
        buton3=findViewById(R.id.button3);
        buton4=findViewById(R.id.button4);
        buton5=findViewById(R.id.button5);
        buton6=findViewById(R.id.button6);
        buton7=findViewById(R.id.button7);
        buton8=findViewById(R.id.button8);
        buton9=findViewById(R.id.button9);
        buton0=findViewById(R.id.button0);
        butonnokta=findViewById(R.id.buttonnokta);
        butonesittir=findViewById(R.id.buttonesittir);
        butontopla=findViewById(R.id.buttonartı);
        butoneksi=findViewById(R.id.buttoneksi);
        butoncarp=findViewById(R.id.buttoncarp);
        butonbol=findViewById(R.id.buttonbol);
        butonmod=findViewById(R.id.buttonmod);
        butonsil=findViewById(R.id.buttonsil);
        butonhepsinisil=findViewById(R.id.buttontamamensil);

        sonucText=findViewById(R.id.ustsonuctextView);
        islemText=findViewById(R.id.altText);

        buton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("0");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"0");
                }
            }
        });

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("1");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"1");
                }
            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("2");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"2");
                }
            }
        });

        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("3");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"3");
                }
            }
        });

        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("4");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"4");
                }
            }
        });

        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("5");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"5");
                }
            }
        });

        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("6");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"6");
                }
            }
        });

        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("7");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"7");
                }
            }
        });

        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("8");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"8");
                }
            }
        });

        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    islemText.setText("9");
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+"9");
                }
            }
        });

        butonnokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                if(islemText.length()==0){
                    Toast.makeText(MainActivity.this, "Lütfen sayı giriniz", Toast.LENGTH_SHORT).show();
                }else{
                    String text=islemText.getText().toString();
                    islemText.setText(text+".");
                }
            }
        });

        butoneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);


                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){

                        int f=1;
                        if(d.length()==0){
                            Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                            f=0;
                        }
                        if(f==1){
                            sonucText.setText(d+"-");
                        }

                    }else{

                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"-");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"-");

                        }

                    }
                } else if (sonucText.length()==0) {
                    System.out.println("else if son");
                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"-");
                    islemText.setText("");

                }else{
                    System.out.println("else");
                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"-");
                    islemText.setText("");

                }
            }
        });

        butoncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){


                            int f=1;
                            if(d.length()==0){
                                Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                                f=0;
                            }
                            if(f==1){
                                sonucText.setText(d+"×");
                            }


                    }else{
                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"×");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"×");

                        }
                    }
                } else if (sonucText.length()==0) {

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"×");
                    islemText.setText("");

                }else{
                    System.out.println("else");
                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"×");
                    islemText.setText("");

                }
            }
        });

        butonbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){

                        int f=1;
                        if(d.length()==0){
                            Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                            f=0;
                        }
                        if(f==1){
                            sonucText.setText(d+"÷");
                        }
                    }else{
                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"÷");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"÷");

                        }

                    }
                } else if (sonucText.length()==0) {

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"÷");
                    islemText.setText("");
                }else{

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"÷");
                    islemText.setText("");
                }
            }
        });

        butonmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){

                        int f=1;
                        if(d.length()==0){
                            Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                            f=0;
                        }
                        if(f==1){
                            sonucText.setText(d+"%");
                        }
                    }else{
                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"%");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"%");

                        }
                    }
                } else if (sonucText.length()==0) {

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"%");
                    islemText.setText("");

                }else{

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"%");
                    islemText.setText("");

                }
            }
        });

        butontopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                String g = null;
                if(sonucText.length()!=0){

                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                }
                if(sonucText.length()==0 && islemText.length()==0){
                    Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                }else if(sonucText.length()!=0){

                    String d="";
                    g=sonucText.getText().toString().substring(sonucText.length()-1,sonucText.length());
                    d=sonucText.getText().toString().substring(0,sonucText.length()-1);

                    if(g.equals("+") || g.equals("%") || g.equals("×") || g.equals("÷") || g.equals("-") || g.equals("^")){
                        System.out.println("ulan if");
                        int f=1;
                        if(d.length()==0){
                            Toast.makeText(getApplicationContext(), "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show();
                            f=0;
                        }
                        if(f==1){
                            sonucText.setText(d+"+");
                        }

                    }else{
                        if(islemText.length()!=0){
                            text1=islemText.getText().toString();
                            sonucText.setText(text1+"+");
                            islemText.setText("");
                        }else{
                            String k=sonucText.getText().toString();
                            text1=sonucText.getText().toString();
                            sonucText.setText(k+"+");

                        }

                    }
                } else if (sonucText.length()==0) {

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"+");
                    islemText.setText("");

                }else{

                    text1=islemText.getText().toString();
                    sonucText.setText(text1+"+");
                    islemText.setText("");

                }
            }
        });

        butonsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);
                    if(islemText.length()!=0 ){

                        String textString=islemText.getText().toString();
                        islemText.setText(textString.substring(0, textString.length() - 1 ));
                        islemText.setSelection(islemText.getText().length());

                    }

            }
        });

        butonhepsinisil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(45);

                islemText.setText("");

            }
        });


        butonesittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titret.vibrate(40);
                esit();



            }
        });










    }

    public void esit(){
        if(sonucText.length()==0 || islemText.length()==0){
            Toast.makeText(MainActivity.this, "Boş", Toast.LENGTH_SHORT).show();
        }else{
            double sayi1=Double.parseDouble(text1);
            double sayi2=Double.parseDouble(islemText.getText().toString());
            String a=sonucText.getText().toString();
            String isaret=a.substring(a.length()-1,a.length());
            System.out.println(isaret);
            if(isaret.equals("-")){
                String cikarma=new DecimalFormat("##.##").format(sayi1-sayi2).replace(',','.');
                sonucText.setText(cikarma);
                islemText.setText("");
            }else if(isaret.equals("+")){
                String toplama=new DecimalFormat("##.##").format(sayi1+sayi2).replace(',','.');
                sonucText.setText(toplama);
                islemText.setText("");

            }else if(isaret.equals("%")){
                String mod=new DecimalFormat("##.##").format(sayi1%sayi2).replace(',','.');
                sonucText.setText(mod);
                islemText.setText("");

            }else if(isaret.equals("×")){
                String carpma=new DecimalFormat("##.##").format(sayi1*sayi2).replace(',','.');
                sonucText.setText(carpma);
                islemText.setText("");
            }else if(isaret.equals("÷")){
                if(sayi2==0){
                    Toast.makeText(MainActivity.this, "Sıfıra bölünemez", Toast.LENGTH_SHORT).show();
                }else{
                    String bolme=new DecimalFormat("##.##").format(sayi1/sayi2).replace(',','.');
                    sonucText.setText(bolme);
                    islemText.setText("");
                }

            }else if(isaret.equals("^")){
                String mod=new DecimalFormat("##.##").format(Math.pow(sayi1,sayi2)).replace(',','.');
                sonucText.setText(mod);
                islemText.setText("");
            }
        }
    }
}