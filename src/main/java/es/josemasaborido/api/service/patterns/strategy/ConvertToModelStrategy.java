package es.josemasaborido.api.service.patterns.strategy;

import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import org.json.JSONObject;

import java.util.List;

/**
 * Strategy convert to model interface
 */
public interface ConvertToModelStrategy<T extends GenericModel> {
    /**
     * Getter method that obtain header object
     * @return header object
     */
    Header getHeader();

    /**
     * Setter method that set with JSONObject
     * @param jsonResponse JSONObject that was recived for the request
     */
    void setJsonResponse(JSONObject jsonResponse);

    /**
     * Method that obtain the results list from JSONObject Response
     * @return result list of request in model format
     * @param <T> class of Model
     */
    <T extends GenericModel> List<T> getResultsModel();
}
