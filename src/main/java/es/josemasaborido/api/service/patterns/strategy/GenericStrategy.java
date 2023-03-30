package es.josemasaborido.api.service.patterns.strategy;

import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.json.JSONObject;

/**
 * Class that define the abstract generic strategy class
 * @author Josema Saborido
 */
@Getter @Setter
@SuperBuilder
public abstract class GenericStrategy<T extends GenericModel> implements ConvertToModelStrategy<T>{
    private JSONObject jsonResponse;
    private Header header;

}
