package pl.pjatk.jaz_s24891_nbp.rate.model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public class Rate {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Table number", example = "A")
    private String no;
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Date", example = "2024-06-06")
    private LocalDate effectiveDate;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Average course", example = "4.31")
    private double mid;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }
}
