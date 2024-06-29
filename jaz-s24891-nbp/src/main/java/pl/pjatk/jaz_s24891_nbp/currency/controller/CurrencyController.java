package pl.pjatk.jaz_s24891_nbp.currency.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.jaz_s24891_nbp.currency.model.Currency;
import pl.pjatk.jaz_s24891_nbp.currency.service.CurrencyService;

import java.time.LocalDate;

@RestController
@RequestMapping("/service")
@Tag(name= "CurrencyService")
public class CurrencyController {


    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }


    @Operation(summary = "Count average currency on a given date")
    @ApiResponse(responseCode = "200",description = "Data retrieved", content = { @Content(schema = @Schema(implementation = Currency.class), mediaType = "application/json")})
    @ApiResponse(responseCode = "404", description = "Data not found", content = { @Content(schema = @Schema()) })
    @GetMapping("/average/{id}")
    public ResponseEntity<Double> returnAverage(@PathVariable String code, @RequestParam LocalDate date) {
        return ResponseEntity.ok(currencyService.countAverage(code));
    }

}
