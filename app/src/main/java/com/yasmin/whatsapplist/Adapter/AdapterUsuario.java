package com.yasmin.whatsapplist.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yasmin.whatsapplist.Model.Usuario;
import com.yasmin.whatsapplist.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {



    private List <Usuario> usuarioList = new ArrayList<>();

    public AdapterUsuario(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
    @NonNull
    @Override
    //criar anotacoes
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        itemLista = layoutInflater.inflate(R.layout.usuario_item,parent,false);
        return new UsuarioViewHolder(itemLista);
    }

    //exibir
    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {

        holder.foto.setImageResource(usuarioList.get(position).getFoto());
        holder.nome.setText(usuarioList.get(position).getNome());
        holder.mensagem.setText(usuarioList.get(position).getMensagem());


    }

    ///retornar o tamanho
    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    //viewHolder-visualizacoes
    public class UsuarioViewHolder extends  RecyclerView.ViewHolder{

       private ImageView foto;
       private TextView nome;
       private TextView mensagem;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            foto = itemView.findViewById(R.id.fotoUsuario);
            nome = itemView.findViewById(R.id.nomeUsuario);
            mensagem = itemView.findViewById(R.id.mensagemUsuario);
        }
    }

}
