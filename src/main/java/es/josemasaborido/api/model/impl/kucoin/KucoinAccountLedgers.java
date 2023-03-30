package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 * This interface is for transaction records from all types of your accounts, supporting inquiry of various currencies.
 * Items are paginated and sorted to show the latest first.
 *
 * GET /api/v1/accounts/ledgers
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinAccountLedgers implements GenericModel {
    private Number currentPage;
    private Number pageSize;
    private Number totalNum;
    private Number totalPage;
    private KucoinAccountLedger[] items;
}
