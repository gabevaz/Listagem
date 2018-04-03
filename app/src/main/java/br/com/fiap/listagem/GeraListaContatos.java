package br.com.fiap.listagem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 03/04/2018.
 */

public class GeraListaContatos {

    public static List<Contato> geraContatos(){
        List<Contato> contatos = new ArrayList<Contato>();

        Contato contato1 = new Contato("Paulo José", "11 1234-5678", R.drawable.p1, "Escrevendo..");
        Contato contato2 = new Contato("Gabriela", "11 5678-3214", R.drawable.p3, "Não sei");
        Contato contato3 = new Contato("Gabriel Evangelista", "11 4563-5241", R.drawable.p2, "De boas");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);

        return contatos;
    }
}
