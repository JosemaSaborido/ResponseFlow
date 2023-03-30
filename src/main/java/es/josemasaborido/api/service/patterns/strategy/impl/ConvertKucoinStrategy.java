package es.josemasaborido.api.service.patterns.strategy.impl;

import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.service.patterns.strategy.GenericStrategy;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that define the Kucoin strategy
 * @author Josema Saborido
 */
@Getter @Setter
@SuperBuilder
public class ConvertKucoinStrategy <T extends GenericModel> extends GenericStrategy<T> {
    private Class<? extends GenericModel> clazz;
    @Override
    public List<T> getResultsModel() {
        List<T> resultList = new ArrayList<>();
        
        return resultList;
    }

    @Override
    public Header getHeader() {
        Header header = null;
        return header;
    }
}
