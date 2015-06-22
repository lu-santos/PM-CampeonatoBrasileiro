/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.entidade.Campeonato;
import modelo.entidade.Equipe;

/**
 *
 * @author Lucianna
 */
public class LeitorDeEquipe implements LeitorDAO{
    private EquipeDAO equipeDAO;
    private CampeonatoDAO campeonatoDAO;
    private String nomeArquivo;
    private ConexaoDAO conexao = new ConexaoPostgre();
    private int anoCampeonato;
    
    public LeitorDeEquipe(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.equipeDAO = new EquipeDAO(conexao);
        this.campeonatoDAO = new CampeonatoDAO(conexao);
    }
    
    @Override
    public void lerArquivo() {
        File arquivoTXT = new File(nomeArquivo);
        if (arquivoTXT.exists()) {
            leitura();
        }
    }
    
    private void leitura() {
        BufferedReader ler = null;
        int i = 0;
        try{
            try{
                ler = new BufferedReader(new FileReader(nomeArquivo));
                String linha = ler.readLine();
                anoCampeonato = Integer.parseInt(linha);
                incluirCampeonato(linha);
                while(ler.ready()){
                    linha = ler.readLine();
                    Equipe equipe = new Equipe(linha);
                    if(i < 20)
                        equipeDAO.incluir(equipe);
                    i++;
                }
            }
            catch (Exception ex) {
                Logger.getLogger(LeitorDeEquipe.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                if(ler != null)
                    ler.close();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void incluirCampeonato(String linha) throws Exception {
        Campeonato campeonato = new Campeonato(anoCampeonato);
        campeonatoDAO.incluir(campeonato);
        
    }
}
