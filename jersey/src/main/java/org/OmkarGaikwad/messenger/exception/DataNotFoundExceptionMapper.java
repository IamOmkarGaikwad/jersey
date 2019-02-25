package org.OmkarGaikwad.messenger.exception;

import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		org.OmkarGaikwad.messenger.model.ErrorMessage errorMessage = new org.OmkarGaikwad.messenger.model.ErrorMessage(ex.getMessage(), 404, "http://messenger.omkar.org");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}		
}
