package loslibertadores.com.suma;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Button calcular = (Button) findViewById(R.id.btnCalculo);
        calcular.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Calcular();
            }
        });
    }

    public void Calcular(){
        final Context context = getApplicationContext();
        final int duration;
        duration = Toast.LENGTH_SHORT;

        EditText numeroUno = (EditText) findViewById(R.id.txtNumeroUno);
        EditText numeroDos = (EditText) findViewById(R.id.txtNumeroDos);

        String valorUno = numeroUno.getText().toString();
        String valorDos = numeroDos.getText().toString();

        if(valorUno.equals("") || valorDos.equals("")){
            Toast mensaje = Toast.makeText(context, "Hey, llena los números", duration);
            mensaje.show();

        }else{
            int suma = 0;
            suma = Integer.parseInt(valorUno) + Integer.parseInt(valorDos);
            TextView tv = (TextView) findViewById(R.id.tvTotal);

            tv.setText("TOTAL: " + suma);
            Toast mensaje2 = Toast.makeText(context, "Calculo realizado", duration);
            mensaje2.show();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
