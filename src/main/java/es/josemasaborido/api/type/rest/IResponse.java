package es.josemasaborido.api.type.rest;

import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import es.josemasaborido.api.type.Rest;

import java.util.List;

/**
 * Response interface for rest request
 * @param <T> object type that it work
 */
public interface IResponse<T extends GenericModel> extends Rest {
    /**
     * Getter method that obtains the reponse´s headers
     * @return object header
     */
    Header getHeader();

    /**
     * Setter method to set header
     * @param header object
     */
    void setHeader(Header header);

    /**
     * Getter method that obtains the results of the request
     * @return object entity list
     */
    List<T> getResults();

    /**
     * Setter method to set header
     * @param results list
     */
    void setResults(List<T> results);

}
