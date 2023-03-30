package es.josemasaborido.api.model;

/**
 * Topic Interface for websockets topics
 * @author Josema Saborido
 */
public interface Topic extends IEndPoint {
    /**
     * Return topic of the websocket
     * @return topic
     */
    String getTopic();
}
