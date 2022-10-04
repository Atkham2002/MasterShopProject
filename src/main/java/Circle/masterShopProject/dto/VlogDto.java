package Circle.masterShopProject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VlogDto {
    private Integer id;
    private String title;
    private String body;
    private List<PhotoDto> phoneDtos;
    private List<LinkDto> linkDtos;
    private CatalogDto catalogDto;
}
