package com.br.ufrn.almoxarifado;

import com.br.ufrn.almoxarifado.producao.*;
import com.br.ufrn.almoxarifado.rh.*;
import com.br.ufrn.almoxarifado.COQ.*;
import com.br.ufrn.almoxarifado.controleQualidade.*;

public class Main {
	public static void main(String[] args) {
		Almoxarifado almoxarifado = new Almoxarifado();
		ChecklistRecebimentoComum chRecebimentoComum = new ChecklistRecebimentoComum();
		ChecklistTransferencia chTransferencia = new ChecklistTransferencia();
		ClassificacaoMaterial classificacaoMaterial = new ClassificacaoMaterial();
		ConferenciaPesagem confPesagem = new ConferenciaPesagem();
		DadosEntrega entrega = new DadosEntrega();
		DadosFrete frete = new DadosFrete();
		DadosPagamento pagamento = new DadosPagamento();
		DimensaoUnidade dUnidade = new DimensaoUnidade();
		EntradaEstoque eEstoque = new EntradaEstoque();
		EstadoLote estadoLote;
		Estoque estoque = new Estoque();
		GrupoMaterial grupoMaterial = new GrupoMaterial();
		GuiaRemessa guiaRemessa = new GuiaRemessa();
		HistoricoRequisicao historicoRequisicao = new HistoricoRequisicao();
		ItemRequisicao item = new ItemRequisicao();
		LocalizacaoAlmoxarifado localizacao = new LocalizacaoAlmoxarifado();
		LoteMaterial loteMaterial = new LoteMaterial();
		Material material = new Material();
		SolicitacaoAnalise solicitacaoAnalize = new SolicitacaoAnalise();
		MetodoEspecificoAnalise metodo = new MetodoEspecificoAnalise();
		MaterialAnalisavel materialAnalisavel = new MaterialAnalisavel();
        MovimentacaoEntrada movimentacaoEntrada = new MovimentacaoEntrada();
        MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();
        MovimentacaoSaida movimentacaoSaida = new MovimentacaoSaida();
        NaturezaOperacao naturezaOperacao = new NaturezaOperacao();
        NotaFiscal notaFiscal = new NotaFiscal();
        ReservaMaterial reservaMaterial = new ReservaMaterial();
        SaidaEstoque saidaEstoque = new SaidaEstoque();
        SaidaRequisicaoInterna saidaReqInterna = new SaidaRequisicaoInterna();
        UnidadeMedida unidadeMedida = new UnidadeMedida();
        Usuario usuario = new Usuario();
        VolumeMaterial volumeMaterial = new VolumeMaterial();
        DenominacaoComumBrasileira dcb = new DenominacaoComumBrasileira();
        Funcionario funcionario = new Funcionario();
        OrdemProducao ordemProducao = new OrdemProducao();
        PessoaJuridica pj = new PessoaJuridica();
        Setor setor = new Setor();
	}
}
