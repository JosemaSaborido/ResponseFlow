package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 *Class that define a simple user account
 *
 * GET /api/v1/accounts
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinAccount implements GenericModel {
    private String id;
    private String currency;
    private String main;
    private String balance;
    private String available;
    private String holds;
}
