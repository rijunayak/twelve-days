package com.nayak.pathashala67;

import org.junit.jupiter.api.Test;

import static com.nayak.pathashala67.ChristmasNumber.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChristmasNumberTest {

    @Test
    void should_ensure_two_is_greater_than_or_equal_to_one() {
        assertThat(Two.isGreaterThanOrEqualTo(One), is(true));
    }

    @Test
    void should_ensure_two_is_greater_than_or_equal_to_two() {
        assertThat(Two.isGreaterThanOrEqualTo(Two), is(true));
    }

    @Test
    void should_ensure_two_is_not_greater_than_or_equal_to_three() {
        assertThat(Two.isGreaterThanOrEqualTo(Three), is(false));
    }

    @Test
    void should_ensure_one_when_two_is_decremented() {
        assertThat(Two.decrement(), is(equalTo(One)));
    }

    @Test
    void should_ensure_two_when_three_is_decremented() {
        assertThat(Three.decrement(), is(equalTo(Two)));
    }

    @Test
    void should_be_an_unsupported_operation_when_the_number_one_is_decremented() {
        UnsupportedOperationException unsupportedOperationException = assertThrows(
                UnsupportedOperationException.class,
                One::decrement
        );
        assertThat(
                unsupportedOperationException.getMessage(),
                is(equalTo("Cannot decrement the lowest Christmas number"))
        );
    }
}
