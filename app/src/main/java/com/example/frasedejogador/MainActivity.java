package com.example.frasedejogador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrase(View view){
        String[] frases = {
                "No México que é bom. Lá a gente recebe semanalmente de 15 em 15 dias.",
                "Estou muito feliz de jogar na Sociedade Esportiva Corinthians.\n" +
                        "(Atribuída a Gustavo Nery, ex-Corinthians e Flu, na apresentação no Timão, confundindo o nome do clube com o do Palmeiras, maior rival).",
                "O time estava com um esquema mais difícil. Eu sentia que estava saindo das minhas características e isso me prejudicava. O melhor é simplificar. Mas é dificil fazer o fácil...",
                "Os jogos do Santos no Campeonato Nacional, serão realizados na Vila Belmiro, desde que nosso campo tenha boas condições físicas...",
                "Jogador tem que ser completo como o pato, que é um bicho aquático e gramático.",
                "Afastei o Alexandre, porque resolvi privatizar a disciplina.",
                "A senhora, além de muito bonita, é uma troglodita muito inteligente.",

        };
        int numero = new Random().nextInt(frases.length);
        TextView novaFrase = findViewById(R.id.frase);
        novaFrase.setText(frases[numero]);


    }
}
