package exemploname.com.exemploname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {
    TextView meutexto;
    //Constante "MinhaChave" responsavel por ser a chave (indice) da String que vem no bundle
    public static final String MinhaChave = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        //TextView do layout
        meutexto = (TextView)findViewById(R.id.meutexto);
        //Obtendo o Intent que vem da Sender
        Intent outroIntent = getIntent();
        //Obtendo o Bundle que vem da Sender
        Bundle outroBundle = outroIntent.getExtras();
        //Obtendo a String que vem na chave "MinhaChave" dentro do Bundle
        String umValor = outroBundle.getString("MinhaChave");
        //Inserindo a String que veio no Bundle, na TextView da tela Receptor
        meutexto.setText(umValor);


    }


}
