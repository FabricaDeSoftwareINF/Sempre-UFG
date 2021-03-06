package br.ufg.inf.sempreufg.modelo;

import br.ufg.inf.sempreufg.enums.Nivel;
import br.ufg.inf.sempreufg.enums.TipoInstituicao;

public class CursoOutrasIES {

    private String nomeDoCurso;

    private String unidadeAcademia;

    private String iesDoCurso;

    private String urlInstitucional;

    private Nivel nivel;

    private TipoInstituicao tipoInstituicao;

    private AreaDeConhecimento area_conhecimento;

    public AreaDeConhecimento getArea_conhecimento() {
        return area_conhecimento;
    }

    public void setArea_conhecimento(AreaDeConhecimento area_conhecimento) {
        this.area_conhecimento = area_conhecimento;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getUnidadeAcademia() {
        return unidadeAcademia;
    }

    public void setUnidadeAcademia(String unidadeAcademia) {
        this.unidadeAcademia = unidadeAcademia;
    }

    public String getIesDoCurso() {
        return iesDoCurso;
    }

    public void setIesDoCurso(String iesDoCurso) {
        this.iesDoCurso = iesDoCurso;
    }

    public String getUrlInstitucional() {
        return urlInstitucional;
    }

    public void setUrlInstitucional(String urlInstitucional) {
        this.urlInstitucional = urlInstitucional;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public TipoInstituicao getTipoInstituicao() {
        return tipoInstituicao;
    }

    public void setTipoInstituicao(TipoInstituicao tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }

}
