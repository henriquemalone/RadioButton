package seekbar.cursoandroid.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private RadioGroup radioGroup;
    private RadioButton radioEscolhido;
    private TextView textoEscolha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoEscolherId);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupId);
        textoEscolha = (TextView) findViewById(R.id.escolhaId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                if(radioButtonEscolhido > 0){
                    radioEscolhido = (RadioButton) findViewById(radioButtonEscolhido);
                    textoEscolha.setText(radioEscolhido.getText());
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void finish() {
        super.finish();
    }
}
