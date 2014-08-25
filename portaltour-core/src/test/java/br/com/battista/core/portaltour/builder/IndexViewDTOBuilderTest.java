package br.com.battista.core.portaltour.builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import br.com.battista.core.portaltour.dto.IndexViewDTO;

public class IndexViewDTOBuilderTest {

	@Test
	public void aoExecutarBuilderDeveRetornaNovaInstancia() {
		assertNotNull("Builder não pode retorna nulo!", new IndexViewDTOBuilder().build());
	}

	@Test
	public void aoExecutarBuilderPreenchidoDeveRetornaNovaInstanciaPreenchido() {
		String usuario = "rabsouza";

		IndexViewDTOBuilder builder = new IndexViewDTOBuilder();
		builder.setUsuario(usuario);

		IndexViewDTO obj = builder.build();
		assertNotNull("Builder não pode retorna nulo!", obj);
		assertTrue("Objeto deve vim preenchido!", StringUtils.isNoneBlank(obj.getUsuario()));
	}

}
