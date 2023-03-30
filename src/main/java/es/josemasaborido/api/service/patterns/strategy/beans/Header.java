package es.josemasaborido.api.service.patterns.strategy.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/**
 * Class that define header request response
 * @author Jose Manuel Saborido Noriega
 */
@Getter @Setter
@NoArgsConstructor
public class Header {
    Map<String, Object> headers;
}
