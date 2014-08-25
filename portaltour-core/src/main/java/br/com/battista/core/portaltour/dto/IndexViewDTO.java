package br.com.battista.core.portaltour.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * DTO para a pagina /pages/index.xhtml
 *
 * @author rabsouza
 * @since 08/2014
 *
 */
public class IndexViewDTO implements Serializable {

	private static final long serialVersionUID = -3279786347168543052L;

	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append("usuario", usuario);
		return builder.build();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		IndexViewDTO other = (IndexViewDTO) obj;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(getUsuario(), other.getUsuario());

		return builder.build();
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getUsuario());

		return builder.build();
	}

}
