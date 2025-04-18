package khuong.com.kitchendomain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MenuItemAvailabilityDTO {
    private Long menuItemId;
    private Boolean available;

    public boolean isAvailable() {
        return available != null && available;
    }
}