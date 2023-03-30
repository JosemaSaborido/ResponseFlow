package es.josemasaborido.api.provider.kucoin;

import es.josemasaborido.api.type.GenericApi;

/**
 * Generic interface for Kucoin
 * @author Josema Saborido
 */
public interface Kucoin extends GenericApi {
    /**
     * Return the api phrasse provider
     * @return api phrasse provide
     */
    String getApiPhrasse();
}
