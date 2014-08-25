package br.com.battista.core.portaltour.builder;

/**
 * Interface genérica para os builder
 *
 * @author rabsouza
 * @since 08/2014
 *
 * @param <Type> Classe retorno do builder
 */
public interface Builder<Type> {

	Type build();

}
