package br.ufg.inf.sempreufg.servico;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.List;
import java.util.Map;

import br.ufg.inf.sempreufg.enums.NomeCampos;
import br.ufg.inf.sempreufg.enums.Sexo;
import br.ufg.inf.sempreufg.enums.VisibilidadeDados;
import br.ufg.inf.sempreufg.modelo.CursoUFG;
import br.ufg.inf.sempreufg.modelo.Egresso;
import br.ufg.inf.sempreufg.modelo.HistoricoUFG;
import br.ufg.inf.sempreufg.modelo.LocalizacaoGeografica;
import br.ufg.inf.sempreufg.to.ImportarEgressoTO;

public class EgressoService implements EgressoServiceInterface {

    final CursoService cursoService = new CursoService();

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#importarEgressos()
     */
    @Override
    public void importarEgressos(final ImportarEgressoTO importarEgressoTO) {
        // TODO Auto-generated method stub

    }

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#obterListaPeriodo()
     */
    @Override
    public List<String> obterListaPeriodo() {
        return this.criarListaPeriodoMock();
    }

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#obterListaCursos()
     */
    @Override
    public List<CursoUFG> obterListaCursos() {
        return this.cursoService.obterListaCursos();
    }

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#obterListaUnidadeAcademica()
     */
    @Override
    public List<String> obterListaUnidadeAcademica() {
        return this.criarListaPeriodoMock();
    }

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#obterListaRegional()
     */
    @Override
    public List<String> obterListaRegional() {
        return this.criarListaPeriodoMock();
    }

    @Override
    public Egresso converterXmlParaEgresso(InputStream content) {
        Egresso egresso = new Egresso();
        return egresso;
    }

    @Override
    public boolean egressoEValido(Egresso egresso) {
        return false;
    }

    @Override
    public List<Egresso> buscarDadosEgressoViaWebService() {
        return criarListaEgressoMock();
    }

    @Override
    public List<Egresso> buscarDadosEgressoPeloPeriodoConclusaoCurso(Date dataInicial, Date dataFinal) {
        return criarListaEgressoMock();
    }

    @Override
    public List<Egresso> buscarDadosEgressoPeloIdentificadorEgresso(List<Integer> identificadores) {
        return criarListaEgressoMock();
    }

    @Override
    public List<Egresso> buscarDadosEgressoPeloCurso(List<Integer> identificadores) {
        return criarListaEgressoMock();
    }

    @Override
    public List<Egresso> buscarDadosEgressoPelaUnidadeAcademica(List<Integer> identificadores) {
        return criarListaEgressoMock();
    }

    public List<Egresso> criarListaEgressoMock() {
        List<Egresso> egressos = new ArrayList<Egresso>();

        for (int i = 0; i < 10; i++) {
            Egresso egresso = new Egresso("Everton Jose", "Maria", new Date(), Sexo.MASCULINO, "emailAlternativo@gmail.com", new BitSet(),
                    new BitSet(), VisibilidadeDados.PUBLICO, new ArrayList<HistoricoUFG>(), new LocalizacaoGeografica());
            egressos.add(egresso);
        }

        return egressos;
    }

    /**
     *
     * Método responsável por criar uma lista de periodos mockada.
     * 
     * @return List
     * @author Bruno Martins de Carvalho
     */
    private List<String> criarListaPeriodoMock() {
        List<String> egressos = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            egressos.add(2000 + i + ".1");
            egressos.add(2000 + i + ".2");
        }

        return egressos;
    }

    @Override
    public List<Egresso> consultarEgressoPorConsultaPreDefinida(String string) {
        return new ExecultarConsultasMock().criarListaEgresso();
    }

    @Override
    public List<Egresso> consultaPorAdHoc(Map<NomeCampos, String> parametros) {
        return new ExecultarConsultasMock().criarListaEgresso();
    }

    /**
     * @see br.ufg.inf.sempreufg.servico.EgressoServiceInterface#validarFiltroImportacao(br.ufg.inf.sempreufg.to.ImportarEgressoTO)
     */
    @Override
    public boolean validarFiltroImportacao(ImportarEgressoTO importarEgressoTO) {

        boolean filtroImportacaoValida = true;

        if (importarEgressoTO.getPeriodoInicial().isEmpty()) {
            filtroImportacaoValida = false;
        } else if (importarEgressoTO.getPeriodoFinal().isEmpty()) {
            filtroImportacaoValida = false;
        }

        return filtroImportacaoValida;
    }

}
