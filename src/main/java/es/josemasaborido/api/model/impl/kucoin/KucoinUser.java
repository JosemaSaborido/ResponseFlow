package es.josemasaborido.api.model.impl.kucoin;

import es.josemasaborido.api.model.interfaces.User;
import lombok.*;

/**
 * Class that define users
 *
 * GET /api/v1/sub/user
 * @author Josema Saborido
 */

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KucoinUser implements User {
    private String userId;
    private String uid;
    private String subName;
    private Number type;
    private String remarks;
    private String access;
}
