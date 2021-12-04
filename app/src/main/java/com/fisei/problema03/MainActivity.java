package com.fisei.problema03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    char[][] tabla= new char[1][25];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
private void Abecedario(){
        tabla[0][0]='A';tabla[0][1]='B';tabla[0][2]='C';tabla[0][3]='D';tabla[0][4]='E';tabla[0][5]='F';tabla[0][6]='G';tabla[0][7]='H';tabla[0][8]='I';tabla[0][9]='J';tabla[0][10]='K';tabla[0][11]='L';tabla[0][12]='M';tabla[0][13]='N';tabla[0][14]='O';tabla[0][15]='P';tabla[0][16]='Q';tabla[0][17]='R';tabla[0][18]='S';tabla[0][19]='T';tabla[0][20]='U';tabla[0][21]='V';tabla[0][22]='W';tabla[0][23]='X';tabla[0][24]='Y';tabla[0][25]='Z';
        tabla[1][0]='R';tabla[1][1]='I';tabla[1][2]='S';tabla[1][3]='Q';tabla[1][4]='P';tabla[1][5]='A';tabla[1][6]='N';tabla[1][7]='O';tabla[1][8]='W';tabla[1][9]='X';tabla[1][10]='U';tabla[1][11]='M';tabla[1][12]='D';tabla[1][13]='H';tabla[1][14]='Z';tabla[1][15]='T';tabla[1][16]='F';tabla[1][17]='G';tabla[1][18]='B';tabla[1][19]='L';tabla[1][20]='E';tabla[1][21]='Y';tabla[1][22]='K';tabla[1][23]='C';tabla[1][24]='J';tabla[1][25]='V';

    }

}