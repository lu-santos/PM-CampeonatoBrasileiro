/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entidade;

import visao.ColunaTabela;

/**
 *
 * @author Lucianna
 */
public class Jogo {
    private int idJogo;
    private int idRodada;
    private String equipeMandante;
    private String equipeVisitante;
    private int golMandante;
    private int golVisitante;

    public Jogo() {
        
    }

    public Jogo(int idRodada, int golMandante, int golVisitante, String equipeMandante, String equipeVisitante) {
        this.idRodada = idRodada;
        this.golMandante = golMandante;
        this.golVisitante = golVisitante;
        this.equipeMandante = equipeMandante;
        this.equipeVisitante = equipeVisitante;
    }
    
    public Jogo(int golMandante, int golVisitante, String equipeMandante, String equipeVisitante) {
        this.golMandante = golMandante;
        this.golVisitante = golVisitante;
        this.equipeMandante = equipeMandante;
        this.equipeVisitante = equipeVisitante;
    }

    @ColunaTabela(nome="Mandante", indice=0)
    public String getEquipeMandante() {
        return equipeMandante;
    }

    public void setEquipeMandante(String equipeMandante) {
        this.equipeMandante = equipeMandante;
    }

    @ColunaTabela(nome="Visitante", indice=2)
    public String getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(String equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getIdRodada() {
        return idRodada;
    }

    public void setIdRodada(int idRodada) {
        this.idRodada = idRodada;
    }

    public int getGolMandante() {
        return golMandante;
    }

    public void setGolMandante(int golMandante) {
        this.golMandante = golMandante;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }
    
    @ColunaTabela(nome="Placar", indice=1)
    public String getPlacar() {
        return golMandante + "x" + golVisitante;
    }
}
