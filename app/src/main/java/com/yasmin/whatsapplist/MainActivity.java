package com.yasmin.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.yasmin.whatsapplist.Adapter.AdapterUsuario;
import com.yasmin.whatsapplist.Model.Usuario;
import com.yasmin.whatsapplist.RecyclerItemClickListener.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_usuario;
    private List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_usuario = findViewById(R.id.recycler_usuarios);

        //formato da lista-layout Manager
        recycler_usuario.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false));

        //desempenho
        recycler_usuario.setHasFixedSize(true);
        //adapter
        AdapterUsuario adapterUsuario = new AdapterUsuario(usuarioList);
        recycler_usuario.setAdapter(adapterUsuario);

        Usuarios();

        //eventos de click

        recycler_usuario.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(),
                recycler_usuario,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        Usuario usuario= usuarioList.get(position);

                        Toast.makeText(getApplicationContext(),"Usuário" + usuario.getNome(),Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                        Usuario usuario= usuarioList.get(position);
                        Toast.makeText(getApplicationContext(),"Usuário" + usuario.getNome(),Toast.LENGTH_LONG).show();
                    }
q
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));
    }


    public  void Usuarios(){

        Usuario usuario1 = new Usuario("Boa tarde!",R.drawable.usuario1,"Bryan");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario("Boa tarde, como vai?",R.drawable.usuario2,"Mia");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario("Muito bem e voce? Estou entrando em contato para saber mais sobre o produto",R.drawable.usuario1,"Dominic");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario("ótima! Claro, qual sua dúvida",R.drawable.usuario2,"Letty");
        usuarioList.add(usuario4);

        Usuario usuario5 = new Usuario("Podemos marcar um encontro para conversamos sobre?",R.drawable.usuario1,"Vince");
        usuarioList.add(usuario5);

        Usuario usuario6 = new Usuario("Hoje ás 18:00 podemos conversar sobre a encomenda",R.drawable.usuario2,"Hector");
        usuarioList.add(usuario6);

        Usuario usuario7 = new Usuario("Perfeito! Te encontro na loja",R.drawable.usuario1,"Tanner");
        usuarioList.add(usuario7);

        Usuario usuario8= new Usuario("Tudo certo",R.drawable.usuario2,"Monica");
        usuarioList.add(usuario8);

        Usuario usuario9 = new Usuario("Pode trazer o carro",R.drawable.usuario1,"Tej");
        usuarioList.add(usuario9);

        Usuario usuario10 = new Usuario("Que hora é a corrida?",R.drawable.usuario2,"Suki");
        usuarioList.add(usuario10);
    }

}