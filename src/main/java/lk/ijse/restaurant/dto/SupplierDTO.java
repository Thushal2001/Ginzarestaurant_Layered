package lk.ijse.restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SupplierDTO {
    private String id;
    private String name;
    private String contact;
    private String address;
}
