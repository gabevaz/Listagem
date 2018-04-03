package br.com.fiap.listagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstContatos;
    List<Contato> contatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstContatos = findViewById(R.id.lstContatos);

        contatos = GeraListaContatos.geraContatos();

        ContatosAdapter adapter = new ContatosAdapter(this, contatos);


        lstContatos.setAdapter(adapter);

        lstContatos.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, contatos.get(position).getNome(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
