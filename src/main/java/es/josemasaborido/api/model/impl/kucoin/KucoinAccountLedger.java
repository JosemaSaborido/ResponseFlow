package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 * This interface is for transaction records from all types of your accounts, supporting inquiry of various currencies.
 * Items are paginated and sorted to show the latest first.
 *
 * @see KucoinAccountLedgers
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinAccountLedger implements GenericModel {
    private String id;
    private String currency;
    private String amount;
    private String fee;
    private String balance;
    private String accountType;
    private String bizType;
    private String direction;
    private Number createdAt;
    private String context;

}
