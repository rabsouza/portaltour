package br.com.battista.core.portaltour.builder;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import br.com.battista.core.portaltour.dto.IndexViewDTO;

/**
 * Builder para a classe: IndexViewDTO
 *
 * @author rabsouza
 * @since 23/08/2014
 */
public class IndexViewDTOBuilder implements Builder<IndexViewDTO> {

	private static final Logger LOGGER = LogManager.getLogger(IndexViewDTOBuilder.class.getName());

	private IndexViewDTO indexViewDTO = null;

	public IndexViewDTOBuilder() {
		indexViewDTO = new IndexViewDTO();
	}

	public IndexViewDTOBuilder setUsuario(String usuario) {
		indexViewDTO.setUsuario(usuario);
		return this;
	}

	@Override
	public IndexViewDTO build() {
		LOGGER.debug(String.format("Criando uma nova instancia para %s.", indexViewDTO));
		return indexViewDTO;
	}

}
