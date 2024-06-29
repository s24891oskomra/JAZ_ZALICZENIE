package pl.pjatk.jaz_s24891_nbp.currency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.jaz_s24891_nbp.currency.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
