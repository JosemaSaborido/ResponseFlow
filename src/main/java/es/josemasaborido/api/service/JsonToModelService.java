package es.josemasaborido.api.service;

import es.josemasaborido.api.service.patterns.strategy.ConvertToModelStrategy;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import es.josemasaborido.api.type.GenericApi;
import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.type.rest.IRequest;
import es.josemasaborido.api.type.rest.IResponse;
import es.josemasaborido.api.type.rest.impl.Response;
import lombok.*;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Service that catch json of the provider api rest and transform to model object
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@Builder
public class JsonToModelService<T extends GenericModel> {

    //ATRIBUTOS
    private Class<? extends  GenericModel> clazz;

    //METODOS

    /**
     * Method that send the request and obtain the result json for compose the response
     * @param request to the api provider
     * @return object IResponse
     */
    public IResponse<T> sendRequestAndConvertResponseJsonToModel(IRequest request) throws ClassNotFoundException, NullPointerException{
        String resultRequest = request.sendRequest();
        IResponse<T> response;
        response = this.convertToModel(resultRequest, request);
        return response;
    }

    /**
     * It does the translation to the response
     * @param resultRequest string with json response
     * @param request object
     * @return an object response;
     */
    private IResponse<T> convertToModel(String resultRequest, IRequest request) {
        IResponse<T> response = new Response<>();
        JSONObject jsonResponse = new JSONObject(resultRequest);
        ConvertToModelStrategy convertToModelStrategy = this.selectConvertStrategy(request.getApi());
        if(convertToModelStrategy != null){
            //Set response values
            convertToModelStrategy.setJsonResponse(jsonResponse);
            Header headerResponse = convertToModelStrategy.getHeader();
            response.setHeader(headerResponse);
            List<T> resultsList = convertToModelStrategy.getResultsModel();
            response.setResults(resultsList);
        }
        return response;
    }

    /**
     * Method that select convert to model strategy
     * @param apiProvider object api provider
     * @return convert strategy object
     */
    private ConvertToModelStrategy selectConvertStrategy(GenericApi apiProvider) {
        ConvertToModelStrategy strategy = null;
        String providerClassName = apiProvider.getClass().getName();
        try {
            String strategyClassName = "Convert" + providerClassName + "Strategy";
            //Obtain the api provider class
            Class<? extends ConvertToModelStrategy> cla = (Class<? extends ConvertToModelStrategy>) Class.forName(strategyClassName);
            //Get instance of provider strategy
            strategy = cla.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException |
                NoSuchMethodException e) {
            //TODO : Implementar el catch
        }
        return strategy;
    }
}
