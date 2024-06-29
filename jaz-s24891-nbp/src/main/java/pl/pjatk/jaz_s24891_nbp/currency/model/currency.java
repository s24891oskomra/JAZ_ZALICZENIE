package pl.pjatk.jaz_s24891_nbp.currency.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import pl.pjatk.jaz_s24891_nbp.rate.model.Rate;

import java.util.ArrayList;

@Schema(description = "Currency model information")
@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Currency id", example = "5")
    private long id;
    @Schema(description = "Table name(A, B or C)", example = "A")
    private String table;
    @Schema(description = "Currency", example = "EURO")
    private String currency;
    @Schema(description = "Currency code", example = "EUR")
    private String code;
    @Transient
    private ArrayList<Rate> rates;

    public Currency() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }
}
