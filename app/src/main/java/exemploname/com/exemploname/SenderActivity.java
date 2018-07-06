package exemploname.com.exemploname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {
    EditText meucampo;
    Button meubotao;
    String valorDoCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
        meubotao = (Button)findViewById(R.id.meubotao);
        meucampo = (EditText)findViewById(R.id.meucampo);

    }
    public void botaoPressionado(View v){
        Toast.makeText(this,"click no botão",Toast.LENGTH_SHORT).show();

        //Meu Intent esta pegando activity que eu quero e transferindo outra activity selecionada
        Intent meuIntent = new Intent(this,ReceptorActivity.class);

        valorDoCampo = meucampo.getText().toString();

       //bundle passagem de dados entre as varias atividades na activity
        Bundle meuBundle = new Bundle();
        //Bundle é um container, próximo a um HashMap
        //Devo inserir uma chave (indice) e um valor para armazenar no Bundle
        //Valor que eu quero jogar em outra activity
        //A chave, deve ser defininda na activity que vai receber o Bundle
        meuBundle.putString("MinhaChave",valorDoCampo);
        //Inserindo o Bundle no Intent, para que seja transferida a informação ao mudar de tela
        meuIntent.putExtras(meuBundle);
        //Método que executa o Intent
        startActivity(meuIntent);
    }
}
