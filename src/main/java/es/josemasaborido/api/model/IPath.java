package es.josemasaborido.api.model;

/**
 * Path Interface for paths of rest
 * @author Josema Saborido
 */
public interface IPath extends IEndPoint {
    /**
     * Return the endpoint api path
     * @return endpoint path
     */
    String getPath();
}
