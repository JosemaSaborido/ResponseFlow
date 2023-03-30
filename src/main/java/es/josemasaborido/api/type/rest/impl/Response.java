package es.josemasaborido.api.type.rest.impl;

import es.josemasaborido.api.model.GenericModel;
import es.josemasaborido.api.service.patterns.strategy.beans.Header;
import es.josemasaborido.api.type.rest.IResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter @Setter
@NoArgsConstructor
public class Response<T extends GenericModel> implements IResponse<T> {
    //ATRIBUTOS
    private Header header;
    private List<T> results;
}
