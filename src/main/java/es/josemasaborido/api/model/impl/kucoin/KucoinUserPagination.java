package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.GenericModel;
import lombok.*;

/**
 * Class that define user with pagination
 * @see KucoinResponseUserPagination
 * @author Josema Saborido
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinUserPagination implements GenericModel {
    private String userId;
    private String uid;
    private String subName;
    private Number status;
    private Number type;
    private String access;
    private Number createAt;
    private String remarks;
}
