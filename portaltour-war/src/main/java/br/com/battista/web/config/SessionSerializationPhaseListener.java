package br.com.battista.web.config;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


/**
 * <code>PhaseListener</code> do JSF para forçar a serialização da sessão do App Engine.
 *
 * @author YaW Tecnologia
 */
public class SessionSerializationPhaseListener implements PhaseListener {

	private static final long serialVersionUID = -4968975256511298079L;

	public SessionSerializationPhaseListener() {
	}

	private void serialSession() {
		final FacesContext facesContext = FacesContext.getCurrentInstance();
		final Map sessionMap = facesContext.getExternalContext().getSessionMap();
		sessionMap.put("forceGaeSessionSerialization", System.currentTimeMillis());
	}

	@Override
	public void afterPhase(final PhaseEvent event) {
		if (event.getPhaseId().equals(PhaseId.RENDER_RESPONSE)
				|| event.getPhaseId().equals(PhaseId.INVOKE_APPLICATION)
				|| (event.getPhaseId().equals(PhaseId.APPLY_REQUEST_VALUES)
				&& event.getFacesContext().getResponseComplete())) {
			serialSession();
		}
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	@Override
	public void beforePhase(PhaseEvent event) {
	}

}
