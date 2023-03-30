package es.josemasaborido.api.type.rest;

import es.josemasaborido.api.type.GenericApi;
import es.josemasaborido.api.type.Rest;


/**
 * Request interface
 * @author Josema Saborido
 */
public interface IRequest extends Rest {
    /**
     * Method that send to api privider the request
     * @return JSONArray
     */
    String sendRequest();

    /**
     * Getter method that return api provider object
     * @return api provider object
     */
    GenericApi getApi();

}
