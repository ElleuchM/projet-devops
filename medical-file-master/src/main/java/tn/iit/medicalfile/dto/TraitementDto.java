package tn.iit.medicalfile.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TraitementDto {

    @NotNull
    private long id;
    @NotNull
    private long dossierId;
    private String medicamentName;
    private float medicamentDosage;
    private float medicamentPrice;
    @NotNull
    private long medicamentId;
}
