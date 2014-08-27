package br.com.battista.web.portaltour.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

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
	private static final Logger LOGGER = LogManager.getLogger(IndexViewMB.class.getName());

	private IndexViewDTO dto = null;

	public IndexViewMB() {
		LOGGER.debug(String.format("Criando a view: %s.", "Index.xhtml"));
		setDto(new IndexViewDTOBuilder().setUsuario("Rafael").build());
	}

	public IndexViewDTO getDto() {
		return dto;
	}

	public void setDto(IndexViewDTO dto) {
		this.dto = dto;
	}

}
