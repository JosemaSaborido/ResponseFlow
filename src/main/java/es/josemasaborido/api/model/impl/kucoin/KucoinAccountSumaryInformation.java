package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 *  Account summary information
 *
 *  GET /api/v1/user-info
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinAccountSumaryInformation implements GenericModel {
    private Number level;
    private Number subQuantity;
    private KucoinAccountSumaryInformation.SubQuantityByType subQuantityByType;
    private Number maxSubQuantity;
    private KucoinAccountSumaryInformation.MaxSubQuantityByType maxSubQuantityByType;

    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    private class SubQuantityByType {
        private Number generalSubQuantity;
        private Number marginSubQuantity;
        private Number futuresSubQuantity;
    }

    @Getter @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    private class MaxSubQuantityByType {
        private Number maxDefaultSubQuantity;
        private Number maxGeneralSubQuantity;
        private Number maxMarginSubQuantity;
        private Number maxFuturesSubQuantity;
    }
}
