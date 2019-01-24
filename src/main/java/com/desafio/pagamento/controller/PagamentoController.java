package com.desafio.pagamento.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.pagamento.dto.PagamentoDTO;
import com.desafio.pagamento.entidade.Pagamento;
import com.desafio.pagamento.servico.PagamentoServico;

@RestController
@RequestMapping("api/v1/pagamentos")
public class PagamentoController {

	private PagamentoServico pagamentoServico;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Pagamento> realizarPagamento(@Valid @RequestBody PagamentoDTO pagamentoDTO) {
		return new ResponseEntity<Pagamento>(pagamentoServico.realizarPagamento(pagamentoDTO), HttpStatus.CREATED);
	}

}