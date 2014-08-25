package br.com.battista.web.portaltour.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.battista.core.portaltour.builder.IndexViewDTOBuilder;
import br.com.battista.core.portaltour.dto.IndexViewDTO;

/**
 * @author Rafa
 * @since 23/08/2014
 */
@ManagedBean
@ViewScoped
public class IndexViewMB implements Serializable {

	private static final long serialVersionUID = -2164938363833312532L;

	private IndexViewDTO dto = null;

	public IndexViewMB() {
		setDto(new IndexViewDTOBuilder().setUsuario("Rafael").build());
	}

	public IndexViewDTO getDto() {
		return dto;
	}

	public void setDto(IndexViewDTO dto) {
		this.dto = dto;
	}

}
