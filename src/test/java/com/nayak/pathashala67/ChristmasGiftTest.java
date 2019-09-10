package com.nayak.pathashala67;

import org.junit.jupiter.api.Test;

import static com.nayak.pathashala67.ChristmasNumber.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

class ChristmasGiftTest {

    @Test
    void should_format_a_single_quantity_of_gift() {
        ChristmasGift gift = new ChristmasGift("Test Gift");

        assertThat(gift.format(One), is(equalTo("a Test Gift")));
    }

    @Test
    void should_format_two_quantities_of_gift() {
        ChristmasGift gift = new ChristmasGift("Test Gift");

        assertThat(gift.format(Two), is(equalTo("two Test Gift")));
    }
}
