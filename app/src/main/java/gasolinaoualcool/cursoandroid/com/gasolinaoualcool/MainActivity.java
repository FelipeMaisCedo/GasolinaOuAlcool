package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.textPrecoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.textPrecoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.resultadoTextId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double precoAlcoolDigitado = Double.parseDouble(precoAlcool.getText().toString());
                Double precoGasDigitado = Double.parseDouble(precoGasolina.getText().toString());

                // precoAlcool / precoGaslina
                Double resultado = precoAlcoolDigitado/precoGasDigitado;

                if(resultado >= 0.7){
                    textoResultado.setText("Melhor usar Gasolina!");
                }else{
                    textoResultado.setText("Melhor usar Álcool!");
                }

            }
        });
    }
}
