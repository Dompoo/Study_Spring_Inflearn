package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code; //FAST NORMAL SLOW
    private String displayName; //빠른배송 일반배송 느린배송
}
