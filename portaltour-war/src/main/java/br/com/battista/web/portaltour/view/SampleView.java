package br.com.battista.web.portaltour.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SampleView implements Serializable {

	private String nome;

	public String getNome() {
		return "Olá " + nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
