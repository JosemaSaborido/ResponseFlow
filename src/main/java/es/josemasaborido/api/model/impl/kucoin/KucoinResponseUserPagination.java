package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 *Class that define final response user with pagination
 *
 * GET /api/v2/sub/user
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinResponseUserPagination implements GenericModel {
    private Number currentPage;
    private Number pageSize;
    private Number totalNum;
    private Number totalPage;
    private KucoinUserPagination[] items;
}
