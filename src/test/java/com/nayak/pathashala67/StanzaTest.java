package com.nayak.pathashala67;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.nayak.pathashala67.ChristmasNumber.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StanzaTest {

    @Test
    void should_form_only_the_first_stanza() {
        ChristmasGift christmasGift = mockChristmasGift("a Partridge in a Pear Tree", One);
        List<ChristmasGift> christmasGifts = new ArrayList<>();
        christmasGifts.add(christmasGift);
        Stanza stanza = new Stanza(christmasGifts, One);

        assertThat(stanza.formattedLine(), is(equalTo("One the first day of Christmas my true love gave to me:" +
                " a Partridge in a Pear Tree.")));
    }

    @Test
    void should_form_two_stanzas() {
        ChristmasGift firstChristmasGift = mockChristmasGift("a Partridge in a Pear Tree", One);
        ChristmasGift secondChristmasGift = mockChristmasGift("two Turtle Doves", Two);
        List<ChristmasGift> christmasGifts = Arrays.asList(firstChristmasGift, secondChristmasGift);
        Stanza stanza = new Stanza(christmasGifts, Two);

        assertThat(stanza.formattedLine(), is(equalTo("One the second day of Christmas my true love gave to me:" +
                " two Turtle Doves," +
                " a Partridge in a Pear Tree.")));
    }

    private ChristmasGift mockChristmasGift(String formattedGift, ChristmasNumber christmasNumber) {
        ChristmasGift christmasGift = mock(ChristmasGift.class);
        when(christmasGift.format(christmasNumber)).thenReturn(formattedGift);
        return christmasGift;
    }
}
