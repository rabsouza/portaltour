/**
 *
 */
package br.com.battista.web.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Derek Berube, WildstarTechnologies, LLC.
 *
 */
public class HttpModifiedSinceRequestWrapper extends HttpServletRequestWrapper {
	private static final Logger LOGGER = LogManager.getLogger(HttpModifiedSinceRequestWrapper.class.getName());

	/**
	 * @param request
	 */
	public HttpModifiedSinceRequestWrapper(HttpServletRequest request) {
		super(request);
		LOGGER.trace("HttpModifiedSinceRequestWrapper");
	}

	@Override
	/**
	 * Returns the header provided it is not the "If-Modified-Since" header.
	 */
	public String getHeader(String name) {
		LOGGER.trace(String.format("init: getHeader(String): ", name));
		String header = null;
		if (!"If-Modified-Since".equals(name)) {
			header = super.getHeader(name);
		} // END if (!"If-Modified-Since".equals(name))
		LOGGER.trace(String.format("exit: getHeader(String): ", name));
		return header;
	}

	@SuppressWarnings("rawtypes")
	@Override
	/**
	 * Returns headers stripping out the "If-Modified-Since" header if
	 * present.
	 */
	public Enumeration getHeaderNames() {
		LOGGER.trace("init: getHeaderNames()");
		Enumeration headerNames = null;
		Enumeration<?> enu = null;
		List<String> names;
		String name = null;

		names = new ArrayList<String>();
		enu = super.getHeaderNames();

		while (enu.hasMoreElements()) {
			name = enu.nextElement().toString();
			if (!"If-Modified-Since".equals(name)) {
				names.add(name);
			} // END if (!"If-Modified-Since".equals(name))
		} // END while (enu.hasMoreElements())
		headerNames = Collections.enumeration(names);
		LOGGER.trace(String.format("exit: getHeaderNames(): %s", headerNames));
		return headerNames;
	}
}