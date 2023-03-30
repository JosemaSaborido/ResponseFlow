package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 *  Information for a single account. Use this endpoint when you know the accountId.
 *
 * GET /api/v1/accounts/{accountId}
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinAnAccount implements GenericModel {
    private String currency;
    private String balance;
    private String available;
    private String holds;
}
