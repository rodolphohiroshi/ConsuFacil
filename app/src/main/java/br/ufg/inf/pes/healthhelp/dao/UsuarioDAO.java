package br.ufg.inf.pes.healthhelp.dao;

import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import br.ufg.inf.pes.healthhelp.model.Usuario;
import br.ufg.inf.pes.healthhelp.model.event.DatabaseEvent;
import br.ufg.inf.pes.healthhelp.model.event.ExternalDatabaseEvent;

/**
 * Esta classe é responsável por operações de banco de dados relacionadas a um {@link Usuario}.
 * Created by cleber on 03/11/16.
 */

public class UsuarioDAO extends AbstractDAO<Usuario> {
    public UsuarioDAO() {
        super(Usuario.class.getCanonicalName(), "usuario");
    }

    @Override
    public void buscarTodos() {
        //TODO
    }

    @Override
    public void buscarPelaId(String id) {
        //TODO
    }

    @Override
    public void inserir(Usuario objeto) {
        //TODO
    }

    @Override
    public void remover(Usuario objeto) {
        //TODO
    }

    @Override
    public void atualizar(Usuario objeto) {
        //TODO
    }

    public void inativar(Usuario usuario) {
        //TODO
    }

    public void buscarPorLogin(String login, String senha) {
        //TODO
        //Stub implementation
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int contador = 0; contador < 3; contador++){
                    Log.i(TAG, "Aguardando contador " + (3 - contador));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Log.i(TAG, "Ops... Erro no Thread.sleep: " + e.getMessage());
                    }
                }
                Usuario usuario = new Usuario();
                usuario.setId("idfpodi");
                usuario.setNome("Cleber Alcântara");
                EventBus.getDefault().post(new ExternalDatabaseEvent<Usuario>(usuario));
            }
        }).start();
    }
}
