package ru.max.naivepatterns.gof.behavioral.strategy;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static ru.max.naivepatterns.gof.behavioral.strategy.Discounter.christmas;
import static ru.max.naivepatterns.gof.behavioral.strategy.Discounter.easter;
import static ru.max.naivepatterns.gof.behavioral.strategy.Discounter.newYear;

class DiscounterTest {


    @Test
    public void testChristmasDiscounter() {
        Discounter staffDiscounter = new ChristmasDiscounter();
        final BigDecimal discountedValue = staffDiscounter.apply(BigDecimal.valueOf(1001));
        assertEquals(0, BigDecimal.valueOf(900.9).compareTo(discountedValue));
    }


    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDiscounter() {
        Discounter staffDiscounter = new EasterDiscounter();
        final BigDecimal discountedValue = staffDiscounter.apply(BigDecimal.valueOf(100));
        assertEquals(0, BigDecimal.valueOf(50).compareTo(discountedValue));
    }

    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDiscounterWithAnonyousTypes() {
        Discounter staffDiscounter = new Discounter() {
            @Override
            public BigDecimal apply(BigDecimal amount) {
                return amount.multiply(BigDecimal.valueOf(0.5));
            }
        };

        final BigDecimal discountedValue = staffDiscounter.apply(BigDecimal.valueOf(100));
        assertEquals(0, BigDecimal.valueOf(50).compareTo(discountedValue));
    }

    @Test
    public void shouldDivideByTwo_WhenApplyingStaffDiscounterWithLamda() {
        Discounter staffDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
        final BigDecimal discountedValue = staffDiscounter.apply(BigDecimal.valueOf(100));
        assertEquals(0, BigDecimal.valueOf(50).compareTo(discountedValue));    }

    @Test
    public void shouldApplyAllDiscounts() {
        List<Discounter> discounters = Arrays.asList(christmas(), newYear(), easter());

        BigDecimal amount = BigDecimal.valueOf(100);

        final Discounter combinedDiscounter = discounters
                .stream()
                .reduce(v -> v, Discounter::combine);

        final BigDecimal discountedValue = combinedDiscounter.apply(amount);
        assertEquals(0, BigDecimal.valueOf(36).compareTo(discountedValue));
    }

    @Test
    public void shouldChainDiscounters() {
        final Function<BigDecimal, BigDecimal> combinedDiscounters = christmas()
                .andThen(newYear());

        final BigDecimal discountedValue = combinedDiscounters.apply(BigDecimal.valueOf(100));
        assertEquals(0, BigDecimal.valueOf(72).compareTo(discountedValue));
    }

}